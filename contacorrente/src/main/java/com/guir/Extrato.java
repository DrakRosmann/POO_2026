package com.guir;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    @Override
    public String toString() {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        return String.format("Data: %s | Hora: %s | Tipo: %-10s | Valor: R$ %.2f\n", 
            dataHora.format(formatoData), 
            dataHora.format(formatoHora), 
            operacao, 
            valor);
    }
    
    
}
