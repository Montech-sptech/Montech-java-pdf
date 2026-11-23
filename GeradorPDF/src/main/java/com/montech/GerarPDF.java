package com.montech;

public class GerarPDF {
    public static void main(String[] args) {
        String nomeArquivo = "relatorio-financeiro-2026-10.pdf";

        // Dados mockados do mês fechado (outubro/2026)
        RelatorioFinanceiro relatorio = RelatorioMock.outubro2026();

        // 1º passo: Thymeleaf preenche o template e devolve o HTML como String
        GeradorHtml geradorHtml = new GeradorHtml();
        String html = geradorHtml.gerarHtmlRelatorioFinanceiro(relatorio);

        // 2º passo: OpenHTMLtoPDF converte esse HTML em PDF
        ConversorPdf conversorPdf = new ConversorPdf();
        conversorPdf.converterHtmlParaPdf(html, nomeArquivo);
    }
}
