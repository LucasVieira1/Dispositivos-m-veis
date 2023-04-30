package com.example.ac2_parte1.dataset;

import com.example.ac2_parte1.R;
import com.example.ac2_parte1.model.SaibaMais;

import java.util.ArrayList;
import java.util.List;

public class SaibaMaisDataset {
    private static List<SaibaMais> lista;
    public static List<SaibaMais> getlista1(){
        lista = new ArrayList<>(3);
        lista.add(new SaibaMais(R.mipmap.zoo1, R.mipmap.zoo2, R.mipmap.zoo3, "O Zoo de Sorocaba é referência em toda América Latina, é o principal atrativo turístico, dispondo de 1.145 animais de 290 espécies, das quais 70% correspondem a fauna nacional e são o ponto forte do Zoológico, com especial destaque para os ameaçados de extinção."));
        return lista;
    }
    public static List<SaibaMais> getlista2(){
        lista = new ArrayList<>(3);
        lista.add(new SaibaMais(R.mipmap.iguatemi1, R.mipmap.iguatemi2, R.mipmap.iguatemi3, "O shopping Iguatemi esplanada conta com diversos serviços, wi-fi, estacionamento, dadeira de rodas, fraudario, valet, ambulatório, carrinho de bebê, cadeira elétrica e muito mais"));
        return lista;
    }
    public static List<SaibaMais> getlista3(){
        lista = new ArrayList<>(3);
        lista.add(new SaibaMais(R.mipmap.chico1, R.mipmap.chico2, R.mipmap.chico3, "Pussui uma área verde com cobertura vegetal,  áreas de regeneração natural de floresta semidecídua e transição para cerrado. O local é apropriado para a prática de esportes, possuindo uma pista de caminhada de 1 km de extensão e cerca de 2 km em trilhas na mata."));
        return lista;
    }
    public static void mudaLayout(SaibaMais saibaMais){
        lista.add(saibaMais);
    }
}
