package guir;

import java.time.LocalDate;

public abstract class Passagem {
    private double custoBase;
    private LocalDate data;
    private int numeroVoo;
    private int quantBagagems;
    private Boolean acessoPrioritario;

    public Passagem(double custoBase, LocalDate data, int numeroVoo, int quantBagagems, Boolean acessoPrioritario) {
        this.custoBase = custoBase;
        this.data = data;
        this.numeroVoo = numeroVoo;
        this.quantBagagems = quantBagagems;
        this.acessoPrioritario = acessoPrioritario;
    }
}
