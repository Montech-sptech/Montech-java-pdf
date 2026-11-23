package com.montech;

import java.time.LocalDate;

import com.montech.RelatorioFinanceiro;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class GeradorHtml {

    private final TemplateEngine templateEngine;

    public GeradorHtml() {
        // Templates em: src/main/resources/templates/*.html
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode(TemplateMode.HTML);
        resolver.setCharacterEncoding("UTF-8");

        templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(resolver);
    }

    public String gerarHtmlRelatorioFinanceiro(RelatorioFinanceiro relatorio) {
        // Variáveis que o template enxerga como ${r} e ${dataGeracao}
        Context contexto = new Context();
        contexto.setVariable("r", relatorio);
        contexto.setVariable("dataGeracao", LocalDate.now());

        return templateEngine.process("relatorio-financeiro", contexto);
    }
}