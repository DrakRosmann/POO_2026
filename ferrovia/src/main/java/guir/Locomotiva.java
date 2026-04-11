package guir;

public class Locomotiva {
    private int id;
    private int quantVagao;
    private double pesoMaximo;

    public Locomotiva(int id, int quantVagao,double pesoMaximo){
        this.id = id;
        this.quantVagao = quantVagao;
        this.pesoMaximo = pesoMaximo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getQuantVagao() {
        return quantVagao;
    }

    public void setQuantVagao(int quantVagao) {
        this.quantVagao = quantVagao;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

}
