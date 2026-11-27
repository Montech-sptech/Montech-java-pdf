package com.montech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GerarPDF {

    private static final DateTimeFormatter FORMATO_DATA_HORA =
            DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

    public static void main(String[] args) {
        // Criados uma única vez e reaproveitados em todas as execuções
        GeradorHtml geradorHtml = new GeradorHtml();
        ConversorPdf conversorPdf = new ConversorPdf();

        ScheduledExecutorService agendador = Executors.newSingleThreadScheduledExecutor();

        Runnable tarefa = () -> {
            // Se uma exceção escapar daqui, o agendador cancela as próximas execuções.
            // Por isso o try/catch envolve toda a tarefa.
            try {
                // Nome único por execução: não sobrescreve os PDFs anteriores
                String nomeArquivo = "relatorio-financeiro-2026-10_"
                        + LocalDateTime.now().format(FORMATO_DATA_HORA) + ".pdf";

                RelatorioFinanceiro relatorio = RelatorioMock.outubro2026();

                // 1º passo: Thymeleaf preenche o template e devolve o HTML
                String html = geradorHtml.gerarHtmlRelatorioFinanceiro(relatorio);

                // 2º passo: OpenHTMLtoPDF converte o HTML em PDF
                conversorPdf.converterHtmlParaPdf(html, nomeArquivo);
            } catch (Exception e) {
                System.out.println("Erro na execução agendada: " + e.getMessage());
            }
        };

        // Primeira execução imediata (delay inicial 0); depois, 1 minuto
        // de espera após o término de cada execução
        System.out.println("Aguardando próximo relatório");
        // Trocar o delay por 24h e o timeUnit para horas no ambiente de produção
        agendador.scheduleWithFixedDelay(tarefa, 0, 1, TimeUnit.MINUTES);

        // Encerra o agendador de forma limpa ao parar o programa (Ctrl+C)
        Runtime.getRuntime().addShutdownHook(new Thread(agendador::shutdown));
    }
}