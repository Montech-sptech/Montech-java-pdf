package com.montech;

import com.montech.DiaCusto;
import com.montech.ServicoCusto;

import java.util.List;

public class RelatorioFinanceiro {

    private String empresa;
    private String mesReferencia;
    private String mesAnterior;
    private String periodo;
    private Double orcamento;
    private Double total;
    private Double orcamentoConsumidoPct;
    private Double folga;
    private String statusNivel;
    private String mensagemPrincipal;
    private Double totalMesAnterior;
    private Double variacaoTotalPct;
    private Double variacaoTotalUsd;
    private String variacaoTotalNivel;
    private Double mediaDiaria;
    private Double mediaDiariaAnterior;
    private Double variacaoMediaPct;
    private String variacaoMediaNivel;
    private Integer voos;
    private Integer voosAnterior;
    private Double variacaoVoosPct;
    private Double custoPorVoo;
    private Double custoPorVooAnterior;
    private Double variacaoCustoPorVooPct;
    private String variacaoCustoPorVooNivel;
    private Integer diaMaisCaro;
    private Double valorDiaMaisCaro;
    private Integer diaMaisBarato;
    private Double valorDiaMaisBarato;
    private List<ServicoCusto> servicos;
    private List<DiaCusto> dias;

    public RelatorioFinanceiro() {
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public String getMesAnterior() {
        return mesAnterior;
    }

    public void setMesAnterior(String mesAnterior) {
        this.mesAnterior = mesAnterior;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getOrcamentoConsumidoPct() {
        return orcamentoConsumidoPct;
    }

    public void setOrcamentoConsumidoPct(Double orcamentoConsumidoPct) {
        this.orcamentoConsumidoPct = orcamentoConsumidoPct;
    }

    public Double getFolga() {
        return folga;
    }

    public void setFolga(Double folga) {
        this.folga = folga;
    }

    public String getStatusNivel() {
        return statusNivel;
    }

    public void setStatusNivel(String statusNivel) {
        this.statusNivel = statusNivel;
    }

    public Double getTotalMesAnterior() {
        return totalMesAnterior;
    }

    public void setTotalMesAnterior(Double totalMesAnterior) {
        this.totalMesAnterior = totalMesAnterior;
    }

    public Double getVariacaoTotalPct() {
        return variacaoTotalPct;
    }

    public void setVariacaoTotalPct(Double variacaoTotalPct) {
        this.variacaoTotalPct = variacaoTotalPct;
    }

    public Double getVariacaoTotalUsd() {
        return variacaoTotalUsd;
    }

    public void setVariacaoTotalUsd(Double variacaoTotalUsd) {
        this.variacaoTotalUsd = variacaoTotalUsd;
    }

    public String getVariacaoTotalNivel() {
        return variacaoTotalNivel;
    }

    public void setVariacaoTotalNivel(String variacaoTotalNivel) {
        this.variacaoTotalNivel = variacaoTotalNivel;
    }

    public Double getMediaDiaria() {
        return mediaDiaria;
    }

    public void setMediaDiaria(Double mediaDiaria) {
        this.mediaDiaria = mediaDiaria;
    }

    public Double getMediaDiariaAnterior() {
        return mediaDiariaAnterior;
    }

    public void setMediaDiariaAnterior(Double mediaDiariaAnterior) {
        this.mediaDiariaAnterior = mediaDiariaAnterior;
    }

    public Double getVariacaoMediaPct() {
        return variacaoMediaPct;
    }

    public void setVariacaoMediaPct(Double variacaoMediaPct) {
        this.variacaoMediaPct = variacaoMediaPct;
    }

    public String getVariacaoMediaNivel() {
        return variacaoMediaNivel;
    }

    public void setVariacaoMediaNivel(String variacaoMediaNivel) {
        this.variacaoMediaNivel = variacaoMediaNivel;
    }

    public Integer getVoos() {
        return voos;
    }

    public void setVoos(Integer voos) {
        this.voos = voos;
    }

    public Integer getVoosAnterior() {
        return voosAnterior;
    }

    public void setVoosAnterior(Integer voosAnterior) {
        this.voosAnterior = voosAnterior;
    }

    public Double getVariacaoVoosPct() {
        return variacaoVoosPct;
    }

    public void setVariacaoVoosPct(Double variacaoVoosPct) {
        this.variacaoVoosPct = variacaoVoosPct;
    }

    public Double getCustoPorVoo() {
        return custoPorVoo;
    }

    public void setCustoPorVoo(Double custoPorVoo) {
        this.custoPorVoo = custoPorVoo;
    }

    public Double getCustoPorVooAnterior() {
        return custoPorVooAnterior;
    }

    public void setCustoPorVooAnterior(Double custoPorVooAnterior) {
        this.custoPorVooAnterior = custoPorVooAnterior;
    }

    public Double getVariacaoCustoPorVooPct() {
        return variacaoCustoPorVooPct;
    }

    public void setVariacaoCustoPorVooPct(Double variacaoCustoPorVooPct) {
        this.variacaoCustoPorVooPct = variacaoCustoPorVooPct;
    }

    public String getVariacaoCustoPorVooNivel() {
        return variacaoCustoPorVooNivel;
    }

    public void setVariacaoCustoPorVooNivel(String variacaoCustoPorVooNivel) {
        this.variacaoCustoPorVooNivel = variacaoCustoPorVooNivel;
    }

    public Integer getDiaMaisCaro() {
        return diaMaisCaro;
    }

    public void setDiaMaisCaro(Integer diaMaisCaro) {
        this.diaMaisCaro = diaMaisCaro;
    }

    public Double getValorDiaMaisCaro() {
        return valorDiaMaisCaro;
    }

    public void setValorDiaMaisCaro(Double valorDiaMaisCaro) {
        this.valorDiaMaisCaro = valorDiaMaisCaro;
    }

    public Integer getDiaMaisBarato() {
        return diaMaisBarato;
    }

    public void setDiaMaisBarato(Integer diaMaisBarato) {
        this.diaMaisBarato = diaMaisBarato;
    }

    public Double getValorDiaMaisBarato() {
        return valorDiaMaisBarato;
    }

    public void setValorDiaMaisBarato(Double valorDiaMaisBarato) {
        this.valorDiaMaisBarato = valorDiaMaisBarato;
    }

    public List<ServicoCusto> getServicos() {
        return servicos;
    }

    public void setServicos(List<ServicoCusto> servicos) {
        this.servicos = servicos;
    }

    public List<DiaCusto> getDias() {
        return dias;
    }

    public void setDias(List<DiaCusto> dias) {
        this.dias = dias;
    }
}