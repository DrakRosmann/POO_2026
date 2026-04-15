package guir;

public class Locomotivas extends CarroFerrovia{
    private int nroMaxvagoes;

    public Locomotivas(int id, int capCarga, int nroMaxvagoes) {
        super(id, capCarga);
        this.nroMaxvagoes = nroMaxvagoes;
    }

    public int getNroMaxvagoes() {
        return nroMaxvagoes;
    }

    public void setNroMaxvagoes(int nroMaxvagoes) {
        this.nroMaxvagoes = nroMaxvagoes;
    }
}
