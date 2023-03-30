package com.example.ac1_parte2.dataset;

import com.example.ac1_parte2.R;
import com.example.ac1_parte2.model.Album;

import java.util.ArrayList;
import java.util.List;

public class AlbumDataset {

    private static List<Album> lista;
    public static List<Album> getlista(){
        lista = new ArrayList<>(3);
        lista.add(new Album("Queen", 1970, "Queen foi uma banda britânica de rock, fundada em 1970 e ativa, sob sua formação clássica, até 1991", "Parlophone Records", R.mipmap.queen));
        lista.add(new Album("GunsnRoses", 1960 , "Guns N' Roses é uma banda norte-americana de hard rock formada em Los Angeles, Califórnia, em 1985", "Rock psicodélico", R.mipmap.gunsnroses));
        lista.add(new Album("TheBeatles", 1985, "The Beatles foi uma banda de rock britânica formada em 1960 na cidade de Liverpool", "Geffen Records", R.mipmap.thebeatles));
        return lista;
    }
    public static void mudaLayout(Album album){
        lista.add(album);
    }
}
