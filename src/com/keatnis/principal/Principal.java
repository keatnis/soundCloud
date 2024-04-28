package com.keatnis.principal;

import com.keatnis.mod.Cancion;
import com.keatnis.mod.MisFavoritos;
import com.keatnis.mod.Podcast;

public class Principal {
    public static void main(String[] args) {
        // llamando a la calse cancion
        Cancion cancion = new Cancion();
        cancion.setArtista("Taylor Swift");
        cancion.meGusta(true);
        cancion.setAlbum("Midnights");
        cancion.setTitulo("Maroon");

        for (int i = 0; i < 300; i++) {
            cancion.meGusta(true);
        }
        for (int i = 0; i < 1000; i++) {
            cancion.reproducir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Gays hablando del cine");
        podcast.setDescripcion("En cada capitulo se habla de las peliculas con personajes LGBTQ+");
        podcast.setPresentador("Anna y B");
        for (int i = 0; i < 100; i++) {
            podcast.reproducir();
        }

        System.out.println(cancion.getTotalReproduciones() + "\n Total de me gustas: "+ cancion.getTotalDeMeGusta());
        System.out.println("Potcats Reproduciones "+ podcast.getTotalReproduciones());

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.addFavoritos(cancion);



    }

}
