import java.util.ArrayList;

public class Deck {
    private final ArrayList<Carta> cartas;
    private int corrente;

    public Deck(){
        this.cartas = new ArrayList<>();
        this.corrente = 0;
    }

    public Carta pegaDeCima() {
        if (cartas.size() == 0) {
            return null;
        }
        return cartas.removeLast();
    }

        public void insereEmBaixo(Carta carta) {
            cartas.add(carta);
        }

        public void posicionaNoInicio(){
            corrente = 0;
        }

        public Carta devolveProximo() {
            Carta aux = cartas.get(corrente);
            if (aux != null) {
                corrente = corrente + 1;
            }
            return aux;
            }
        }

        public void embaralha(){
        throw new UnsupportedOperationException("Implementar embaralha(). ");
        }
}

