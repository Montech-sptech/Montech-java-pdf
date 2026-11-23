package com.montech;

import com.montech.DiaCusto;
import com.montech.ServicoCusto;

import java.util.List;

/**
 * Dados fixos (mock) do fechamento de outubro/2026, extraídos de billing-mock.json.
 * Não há cálculo aqui: tudo já vem pronto, o template só exibe.
 */
public class RelatorioMock {

    public static RelatorioFinanceiro outubro2026() {
        RelatorioFinanceiro r = new RelatorioFinanceiro();
        r.setEmpresa("Empresa Alpha");
        r.setMesReferencia("Outubro de 2026");
        r.setMesAnterior("Setembro de 2026");
        r.setPeriodo("01/10/2026 a 31/10/2026");
        r.setOrcamento(50000.0);
        r.setTotal(46514.34);
        r.setOrcamentoConsumidoPct(93.03);
        r.setFolga(3485.66);
        r.setStatusNivel("warn");
        r.setTotalMesAnterior(45437.6);
        r.setVariacaoTotalPct(-2.37);
        r.setVariacaoTotalUsd(1076.74);
        r.setVariacaoTotalNivel("bad");
        r.setMediaDiaria(1500.46);
        r.setMediaDiariaAnterior(1514.59);
        r.setVariacaoMediaPct(0.93);
        r.setVariacaoMediaNivel("good");
        r.setVoos(10413);
        r.setVoosAnterior(9948);
        r.setVariacaoVoosPct(-4.67);
        r.setCustoPorVoo(4.47);
        r.setCustoPorVooAnterior(4.57);
        r.setVariacaoCustoPorVooPct(2.2);
        r.setVariacaoCustoPorVooNivel("good");
        r.setDiaMaisCaro(28);
        r.setValorDiaMaisCaro(1864.81);
        r.setDiaMaisBarato(3);
        r.setValorDiaMaisBarato(1008.43);

        r.setServicos(List.of(
                new ServicoCusto("Servidor da aplicação", "EC2 · Ubuntu + Docker (site e processamento de logs)", 15977.09, 34.3),
                new ServicoCusto("Banco de dados", "MySQL", 9416.72, 20.2),
                new ServicoCusto("Tratamento e processamento dos dados", "Lambda · ETL em Python", 7812.91, 16.8),
                new ServicoCusto("Armazenamento dos dados coletados", "S3 · bronze, silver e gold", 6467.89, 13.9),
                new ServicoCusto("Transferência de dados", "Tráfego de rede", 3263.87, 7.0),
                new ServicoCusto("Outros", "Monitoramento, Backup e Integrações", 3575.86, 7.7)));

        r.setDias(List.of(
                new DiaCusto(1, 1722.58, 1722.58, 343),
                new DiaCusto(2, 1573.9, 3296.48, 389),
                new DiaCusto(3, 1008.43, 4304.91, 299),
                new DiaCusto(4, 1250.23, 5555.14, 313),
                new DiaCusto(5, 1757.8, 7312.94, 360),
                new DiaCusto(6, 1582.04, 8894.98, 349),
                new DiaCusto(7, 1567.84, 10462.82, 327),
                new DiaCusto(8, 1506.12, 11968.94, 357),
                new DiaCusto(9, 1726.8, 13695.74, 357),
                new DiaCusto(10, 1185.7, 14881.44, 319),
                new DiaCusto(11, 1188.13, 16069.57, 316),
                new DiaCusto(12, 1507.89, 17577.46, 360),
                new DiaCusto(13, 1551.59, 19129.05, 319),
                new DiaCusto(14, 1547.17, 20676.22, 330),
                new DiaCusto(15, 1813.88, 22490.1, 349),
                new DiaCusto(16, 1601.86, 24091.96, 368),
                new DiaCusto(17, 1062.26, 25154.22, 290),
                new DiaCusto(18, 1222.6, 26376.82, 320),
                new DiaCusto(19, 1739.19, 28116.01, 327),
                new DiaCusto(20, 1847.29, 29963.3, 329),
                new DiaCusto(21, 1611.87, 31575.17, 340),
                new DiaCusto(22, 1808.48, 33383.65, 327),
                new DiaCusto(23, 1484.24, 34867.89, 379),
                new DiaCusto(24, 1298.5, 36166.39, 298),
                new DiaCusto(25, 1155.39, 37321.78, 304),
                new DiaCusto(26, 1441.29, 38763.07, 347),
                new DiaCusto(27, 1666.43, 40429.5, 351),
                new DiaCusto(28, 1864.81, 42294.31, 343),
                new DiaCusto(29, 1539.07, 43833.38, 348),
                new DiaCusto(30, 1405.86, 45239.24, 347),
                new DiaCusto(31, 1275.1, 46514.34, 308)));

        return r;
    }
}