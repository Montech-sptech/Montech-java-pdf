package com.montech;

public class DiaCusto {

    private Integer dia;
    private Double valor;
    private Double acumulado;
    private Integer voos;

    public DiaCusto(Integer dia, Double valor, Double acumulado, Integer voos) {
        this.dia = dia;
        this.valor = valor;
        this.acumulado = acumulado;
        this.voos = voos;
    }

    public Integer getDia() {
        return dia;
    }

    public Double getValor() {
        return valor;
    }

    public Double getAcumulado() {
        return acumulado;
    }

    public Integer getVoos() {
        return voos;
    }
}