package guir;

public class VagaoPassageiro extends Vagaos {
    private int passageirosQuant;

    public VagaoPassageiro(int id, int capCarga, boolean freio, int passageiros) {
        super(id, capCarga, freio);
        if((80*passageirosQuant) <= capCarga) this.passageirosQuant = passageiros;
        else throw new IllegalArgumentException("Muita gente");
    }

    public int getPassageirosQuant() {
        return passageirosQuant;
    }

    public void setPassageirosQuant(int passageirosQuant) {
        this.passageirosQuant = passageirosQuant;
    }
}
