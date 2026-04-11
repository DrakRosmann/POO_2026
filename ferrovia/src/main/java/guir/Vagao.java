package guir;

public class Vagao {
    private int id;
    private TipoVagao tipo;
    private double peso;
    private int alturaPorta;
    private int larguraPorta;
    private int tempMin;

    public Vagao(int id, TipoVagao tipo, double peso, int alturaPorta, int larguraPorta,int tempMin) {
        this.id = id;
        this.tipo = tipo;
        switch (tipo){
            case ABERTO -> {
                this.peso = peso;
            }
            case FECHADO -> {
                this.peso = peso;
                this.alturaPorta = alturaPorta;
                this.larguraPorta = larguraPorta;
            }
            case REFRIGERADO -> {
                this.peso = peso;
                this.alturaPorta = alturaPorta;
                this.larguraPorta = larguraPorta;
                this.tempMin = tempMin;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoVagao getTipo() {
        return tipo;
    }

    public void setTipo(TipoVagao tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAlturaPorta() {
        return alturaPorta;
    }

    public void setAlturaPorta(int alturaPorta) {
        this.alturaPorta = alturaPorta;
    }

    public int getLarguraPorta() {
        return larguraPorta;
    }

    public void setLarguraPorta(int larguraPorta) {
        this.larguraPorta = larguraPorta;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }
}
