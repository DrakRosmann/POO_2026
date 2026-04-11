package guir;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
    List<Locomotiva> locomotivasLivres;
    List<Vagao> vagoesLivres;

    public Garagem() {
        locomotivasLivres = new ArrayList<>();
        vagoesLivres = new ArrayList<>();
    }

    public List<Locomotiva> getLocomotivasLivres() {
        return locomotivasLivres;
    }

    public List<Vagao> getVagoesLivres() {
        return vagoesLivres;
    }

    public void adicionalLocomotiva(Locomotiva locomotiva) {
        if(locomotiva != null) {
            locomotivasLivres.add(locomotiva);
        }
    }

    public void adicionarVagao(Vagao vagao) {
        if (vagao != null) {
            vagoesLivres.add(vagao);
        }
    }

    public void removerLocomotiva(Locomotiva l) {
        locomotivasLivres.remove(l);
    }

    public void removerVagoes(Vagao v) {
        vagoesLivres.remove(v);
    }

    public Locomotiva buscaLocomotiva(int id) {
        for (Locomotiva l : locomotivasLivres){
            if (l.getId() == id){
                return l;
            }
        }
        return null;
    }

    public Vagao buscaVagao(int id) {
        for (Vagao v : vagoesLivres){
            if (v.getId() == id){
                return v;
            }
        }
        return null;
    }

    public List listarLocomotivasLivres() {
        if (locomotivasLivres.isEmpty()) {
            System.out.println("Não há locomotivas livres na garagem.");
            return locomotivasLivres;
        }
        System.out.println("as locomotivas disponiveis:");
        for (Locomotiva l : locomotivasLivres) {
            System.out.println(l);
        }

        return null;
    }

    public List listarVagoesLivres() {
        if (vagoesLivres.isEmpty()) {
            System.out.println("Não há vagoes livres na garagem.");
            return vagoesLivres;
        }
        System.out.println("as vagoes disponiveis:");
        for (Vagao v : vagoesLivres) {
            System.out.println(v);
        }

        return null;
    }

    public int QuantidadeLocomotivasLivres() {
        return locomotivasLivres.size();
    }

    public int QuantidadeVagoesLivres() {
        return vagoesLivres.size();
    }
}
