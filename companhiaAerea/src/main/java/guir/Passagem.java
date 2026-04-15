package guir;

import java.time.LocalDate;

public abstract class Passagem {
    private double valor;
    private LocalDate data;
    private int numeroVoo;
    private int quantBagagems;
    private Boolean acessoPrioritario;

    public Passagem(double valor, LocalDate data, int numeroVoo, int quantBagagems, Boolean acessoPrioritario) {
        this.valor = valor;
        this.data = data;
        this.numeroVoo = numeroVoo;
        this.quantBagagems = quantBagagems;
        this.acessoPrioritario = acessoPrioritario;
    }
}
