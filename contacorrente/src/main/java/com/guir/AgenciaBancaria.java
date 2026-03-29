package com.guir;

import java.util.ArrayList;
import java.util.List;

public class AgenciaBancaria {
    private int numero;
    private String nome;
    private List<ContaCorrente> contasBan;

    public AgenciaBancaria(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        contasBan = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ContaCorrente> getContasBan() {
        return contasBan;
    }

    public void cadastrarConta(ContaCorrente conta){
        if(contasBan.contains(conta)){
            throw new IllegalArgumentException("Conta já cadastrada.");
        }
        contasBan.add(conta);
    }

    public ContaCorrente recuperarConta(int numero){
        for (ContaCorrente contas : contasBan){
            if (contas.getNumeroConta() == numero) return contas;
        }
        return null;
    }

    public void encerrarConta(int numero){
        try {
            for (ContaCorrente contas : contasBan) {
                if (contas.getNumeroConta() == numero) contas.encerramento();
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Não é possível o encerramento.");
        }
    }
}
