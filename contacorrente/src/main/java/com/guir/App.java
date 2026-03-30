package com.guir;

public class App {

    public static void main(String[] args) {
        System.out.println("=== TESTANDO CRIAÇÃO DE CONTAS ===");
        ContaCorrente conta1 = new ContaCorrente(1001, "Alice");
        ContaCorrente conta2 = new ContaCorrente(1002, "Bob");
        System.out.println("Contas criadas: " + conta1.getNome() + " e " + conta2.getNome());

        System.out.println("\n=== TESTANDO OPERAÇÕES BÁSICAS ===");
        // Testando Depósito
        conta1.deposito(1500.00);
        System.out.println("Depósito de R$ 1500,00 realizado na conta da " + conta1.getNome());

        // Testando Saque
        conta1.saque(200.00);
        System.out.println("Saque de R$ 200,00 realizado na conta da " + conta1.getNome());

        // Testando Transferência (Alice -> Bob)
        System.out.println("Transferindo R$ 500,00 de " + conta1.getNome() + " para " + conta2.getNome() + "...");
        conta1.transf(conta2, 500.00);

        System.out.println("Saldo atual " + conta1.getNome() + ": R$ " + conta1.getSaldo());
        System.out.println("Saldo atual " + conta2.getNome() + ": R$ " + conta2.getSaldo());

        System.out.println("\n=== IMPRIMINDO EXTRATOS ===");
        System.out.println("Extrato da conta de " + conta1.getNome() + ":");
        for (Extrato e : conta1.getExtrato()) {
            System.out.print(e.toString());
        }

        System.out.println("\nExtrato da conta de " + conta2.getNome() + ":");
        for (Extrato e : conta2.getExtrato()) {
            System.out.print(e.toString());
        }

        System.out.println("\n=== TESTANDO EXCEÇÕES (TRATAMENTO DE ERROS) ===");

        // 1. Tentar sacar mais do que tem
        try {
            System.out.print("Tentando sacar R$ 5000 da Alice: ");
            conta1.saque(5000.00);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO BLOQUEADO: " + e.getMessage());
        }

        // 2. Tentar encerrar conta com saldo
        try {
            System.out.print("Tentando encerrar conta da Alice com saldo: ");
            conta1.encerramento();
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO BLOQUEADO: " + e.getMessage());
        }

        // 3. Encerrar conta corretamente (zerando o saldo antes)
        System.out.println("\n=== TESTANDO ENCERRAMENTO CORRETO ===");
        conta2.saque(500.00); // Bob saca todo o dinheiro
        conta2.encerramento();
        System.out.println("Conta do Bob zerada e encerrada com sucesso!");
        System.out.println("Status da conta do Bob (Ativa = true): " + conta2.isStatus());
    }
}