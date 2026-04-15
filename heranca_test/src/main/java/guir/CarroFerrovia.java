package guir;

public class CarroFerrovia {
    private int id;
    private int capCarga;
    private int testss;

    public CarroFerrovia(int id, int capCarga) {
        this.id = id;
        this.capCarga = capCarga;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
