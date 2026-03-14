package com.guir;
public class Cliente {
    private String nome;
    private String cpf;
    private double valorCompra;
    private int pontuacao;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        valorCompra = 0;
        pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public double getValorCompra() {
        return valorCompra;
    }

    public int calcPontos(){
        if(valorCompra <= 100) return 1;
        else if(valorCompra >= 101 && valorCompra <= 500) return (int) valorCompra/100;
        else return (int) valorCompra/100;
    }

    public double calcDesconto(){
        if(pontuacao >= 10 && pontuacao <= 50) return valorCompra*0.10;
        else if (pontuacao >50) return valorCompra*0.2;
        else return 0;
    }

    public void acumularPontos(){
        pontuacao += calcPontos();
    }

    public void obterDesconto(){
        valorCompra -= calcDesconto();
        pontuacao -= 10;
    }
}
