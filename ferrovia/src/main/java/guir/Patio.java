package guir;

import java.util.ArrayList;
import java.util.List;

public class Patio {
    List<TremComposicao> trensComp;
    public Patio(){
        trensComp = new ArrayList<>();
    }

    public List<TremComposicao> getTrensComp() {
        return trensComp;
    }

    public void adicionarComp(TremComposicao comp){
        trensComp.add(comp);
    }

    public void removerComp(TremComposicao comp){
        trensComp.remove(comp);
    }
}
