package com.guir;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cadastrar cliente.");
        System.out.print("Nome: ");
        String nome = in.next();
        System.out.print("CPF: ");
        String cpf = in.next();
        Cliente cliente = new Cliente(nome, cpf);
        Boolean loop;

        do { 
            loop = menu(in, cliente);
        } while (loop);
    }

    public static Boolean menu(Scanner in, Cliente cliente){
        System.out.println("Selecione uma das opções: ");
        System.out.println("1 - Comprar");
        System.out.println("2 - Consultar pontuação.");
        System.out.println("3 - Sair.");
        System.out.print("SEL: ");
        int sel = in.nextInt();
        switch (sel) {
            case 1:
                comprar(in,cliente);
                break;
            case 2:
                System.out.printf("Você possui %d pontos.\n", cliente.getPontuacao());
                break;
            case 3:
                System.out.println("Saindo...");
                return false;
            default:
                System.out.println("Você digitou errado.");
                break;
        }
        System.out.print("Realizar outra operação (1-SIM | 2-NÃO): ");
        if (in.nextInt() == 1) return true;
        System.out.println("Saindo...");
        return false;
    }

    public static void comprar(Scanner in,Cliente cliente){
        System.out.print("Insira o valor do produto: R$ ");
        cliente.setValorCompra(in.nextDouble());
        if (cliente.getPontuacao() < 10) {
            System.out.printf("Você ganhou %d pontos.\n", cliente.calcPontos());
            cliente.acumularPontos();
        }else{
            System.out.printf("Você possui direito a %d pontos ou R$ %.1f de desconto.\n",cliente.calcPontos(),cliente.calcDesconto());
            System.out.println("1 - Acumular pontos.");
            System.out.println("2 - Obter desconto.");
            System.out.print("SEL: ");
            if(in.nextInt() == 1){
                System.out.printf("Você ganhou %d pontos.\n",cliente.calcPontos());
                cliente.acumularPontos();
            }else{
                cliente.obterDesconto();
                System.out.printf("Valor total com desconto: R$ %.1f\n",cliente.getValorCompra());
            }
        }
    }
}
