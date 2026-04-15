package guir;

import java.time.LocalDate;

public class PrimeiraClasse extends Passagem{

    public PrimeiraClasse(double custoBase, LocalDate data, int numeroVoo) {
        super((custoBase*0.5)+custoBase, data, numeroVoo, 3, true);
    }
}
