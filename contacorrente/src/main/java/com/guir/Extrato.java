package com.guir;

import java.time.LocalDateTime;

public class Extrato {
    private LocalDateTime dataHora;
    private String operacao;
    private double valor;

    public Extrato(LocalDateTime dataHora, String operacao, double valor) {
        this.dataHora = dataHora;
        this.operacao = operacao;
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
