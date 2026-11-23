package com.montech;

public class ServicoCusto {

    private String nome;
    private String servicoAws;
    private Double valor;
    private Double pct;

    public ServicoCusto(String nome, String servicoAws, Double valor, Double pct) {
        this.nome = nome;
        this.servicoAws = servicoAws;
        this.valor = valor;
        this.pct = pct;
    }

    public String getNome() {
        return nome;
    }

    public String getServicoAws() {
        return servicoAws;
    }

    public Double getValor() {
        return valor;
    }

    public Double getPct() {
        return pct;
    }
}