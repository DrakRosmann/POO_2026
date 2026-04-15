package guir;

import java.util.ArrayList;
import java.util.List;

public class TremComposicao {
    private int id;
    private List<Locomotivas> locomotivas;
    private List<Vagao> vagoes;

    public TremComposicao (int id){
        this.id = id;
        locomotivas = new ArrayList<>();
        vagoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Locomotivas> getLocomotivas() {
        return locomotivas;
    }

    public void setLocomotivas(List<Locomotivas> locomotivas) {
        this.locomotivas = locomotivas;
    }

    public List<Vagao> getVagoes() {
        return vagoes;
    }

    public void setVagoes(List<Vagao> vagoes) {
        this.vagoes = vagoes;
    }

    public boolean adicionarLocomotiva(Locomotivas l){

        if(vagoes.size() > 0){
            System.out.println("Erro");
            return false;
        }
        if(locomotivas.size()>=3){
            System.out.println("Erro");
            return false;
        }
        locomotivas.add(l);
        return true;
    }

    public boolean adicionarVagao(Vagao v){
        int capacidadeTotalVagoes=0;
        double capacidadeTotalPeso=0;
        for (Locomotivas l : locomotivas) {
            capacidadeTotalVagoes += l.getQuantVagao();
            capacidadeTotalPeso += l.getPesoMaximo();
        }
        if(locomotivas.isEmpty()){
            throw new IllegalArgumentException("Erro");
        }
        if (vagoes.size() +1 > capacidadeTotalVagoes){
            throw new IllegalArgumentException("Erro");
        }
        if (getPesoTotal() + v.getPeso() > capacidadeTotalPeso){
            throw new IllegalArgumentException("Erro");
        }
        vagoes.add(v);
        return true;
    }
    public void removerUltimo(){
        if (!vagoes.isEmpty()) {
            vagoes.remove(vagoes.size()-1);
        } else {
            throw new IllegalArgumentException("Erro");
        }
    }

    public int getPesoTotal() {
        int total = 0;
        for (Vagao v : vagoes) {
            total += v.getPeso();
        }
        return total;
    }
    public void listar(){
        System.out.println("Composição" + id);
        System.out.println("Locomotivas: ");
        for (Locomotivas l : locomotivas){
            System.out.println("ID: " + l.getId());
        }
        System.out.println("Vagões: ");
        for( Vagao v : vagoes){
            System.out.println("ID:" + v.getId() + "Tipo: " + v.getTipo());
        }
    }
}
