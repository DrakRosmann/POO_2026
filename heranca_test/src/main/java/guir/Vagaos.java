package guir;

public class Vagaos extends CarroFerrovia {
    private boolean freio;

    public Vagaos(int id, int capCarga, boolean freio) {
        super(id, capCarga);
        this.freio = freio;
    }

    public boolean isFreio() {
        return freio;
    }

    public void setFreio(boolean freio) {
        this.freio = freio;
    }
}
