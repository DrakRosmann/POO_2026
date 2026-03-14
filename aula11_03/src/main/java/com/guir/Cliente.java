package com.guir;

public class Cliente {
    private String cpf;
    private String nome;
    private int pontuacao;
    
    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        pontuacao = 0;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }



}
