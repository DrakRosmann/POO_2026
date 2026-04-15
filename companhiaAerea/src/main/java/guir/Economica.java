package guir;

import java.time.LocalDate;

public class Economica extends Passagem{
    public Economica(double custoBase, LocalDate data, int numeroVoo) {
        super((custoBase*0.1)+custoBase, data, numeroVoo, 0, false);
    }
}
