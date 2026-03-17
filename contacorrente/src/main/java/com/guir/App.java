package com.guir;

public class App {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1, "Gui");
        ContaCorrente c2 = new ContaCorrente(2, "Alex");
        conta.deposito(1000);
        System.out.printf("Conta %d  | Saldo: %.1f\n", conta.getNumeroConta(),conta.getSaldo());
        c2.deposito(1500);
    
        System.out.printf("Conta %d  | Saldo: %.1f\n", c2.getNumeroConta(),c2.getSaldo());
        conta.transf(c2, 500);
        System.out.printf("\n");

        System.out.printf("Conta %d  | Saldo: %.1f\n", conta.getNumeroConta(),conta.getSaldo());
        System.out.printf("Conta %d  | Saldo: %.1f\n", c2.getNumeroConta(),c2.getSaldo());

    }
}
