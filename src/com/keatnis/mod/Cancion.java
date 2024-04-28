package com.keatnis.mod;

public class Cancion extends  Audio{
    private String artista;
    private String Album;
    private String Genero;

    @Override
    public int getClasificacion() {
        if(getTotalDeMeGusta() > 5000) {
            return 8;
        }else{
            return 4;
        }
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
