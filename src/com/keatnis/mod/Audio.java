package com.keatnis.mod;

import com.keatnis.calculos.Clasificacion;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalReproduciones;
    private int totalDeMeGusta;
    private int clasificacion;

    private double sumaDeEvaluaciones;
    private int totalDeEvaluacion;



    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void reproducir(){
        this.totalReproduciones++;
    }
    public void meGusta(boolean like) {
        if (like) {
            this.totalDeMeGusta++;
        } else {
           this.totalDeMeGusta--;
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalReproduciones() {
        return totalReproduciones;
    }

    public void setTotalReproduciones(int totalReproduciones) {
        this.totalReproduciones = totalReproduciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public double getSumaDeEvaluaciones() {
        return sumaDeEvaluaciones;
    }

    public void setSumaDeEvaluaciones(double sumaDeEvaluaciones) {
        this.sumaDeEvaluaciones = sumaDeEvaluaciones;
    }


}
