package com.guir;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Cadastrar usuario.\nNome: ");
        String nome = in.next();
        System.out.printf("CPF: ");
        String cpf = in.next();

        Cliente cliente = new Cliente(cpf, nome);
 
    

    }
    public static void pontuacaoCompra(Cliente cliente, double valorCompra){
        if(valorCompra <= 100){
            pontuacao += 1;
        }
        else if(valorCompra > 101 && valorCompra <= 500){
            pontuacao += (valorCompra/100);
        }
        else if(valorCompra > 500){
            pontuacao += (valorCompra/100);
        }
    }

    public static double desconto(){
        if(pontuacao >= 10 && pontuacao <= 50){
            return valorCompra - (valorCompra*0.10);
        }
        else if (pontuacao >50){
            return valorCompra - (valorCompra*0.20);
        }
        else{
            return valorCompra;
        }
    }
}
