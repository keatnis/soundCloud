package com.keatnis.mod;

public class Podcast extends Audio{
    private String presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getTotalReproduciones() >= 1000){
            return 8;
        }else{
            return 6;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
