package com.guir;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContaCExtrato {
    private int numeroConta;
    private String nome;
    private double saldo;
    private boolean status;
    private List<Extrato> extrato;

    public ContaCExtrato(int numeroConta, String nome){
        if(numeroConta<0) throw new IllegalArgumentException("Numero de conta fora de padrão.");
        
        this.numeroConta = numeroConta;
        if(nome.length()<2) throw new IllegalArgumentException("Nome fora do padrão.");
        
        this.nome = nome;
        saldo = 0;
        status = true;
        extrato = new ArrayList<>();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Extrato> getExtrato() {
        return extrato;
    }

    public List<Extrato> extratoFiltro(LocalDateTime time){
        List<Extrato> filtro = extrato.stream().filter(extrato -> extrato.getDataHora()==time).collect(Collectors.toList());
        return filtro;
    }

    public void generateExtrato(LocalDateTime data, String operacao, double valor){
        extrato.add(new Extrato(data,operacao,valor));
    }

    public void deposito(double valor){
        if(valor < 0) throw new IllegalArgumentException("Valor incorreto.");
        saldo += valor;
        generateExtrato(LocalDateTime.now(), "Deposito", valor);
    }

    public void saque(double valor){
        if(valor <= 0) throw new IllegalArgumentException("Valor incorreto.");
        else if(valor > saldo) throw new IllegalArgumentException("Valor maior que saldo disponivel.");
        saldo -= valor;
        generateExtrato(LocalDateTime.now(), "Saque", valor);
    }

    public void transf(ContaCorrente contaDest, double valor){
        saque(valor);
        contaDest.deposito(valor);
    }

    public void encerramento(){
        if(saldo > 0) throw new IllegalArgumentException("Possui saldo pendente.");
        status = false;
    }




}
