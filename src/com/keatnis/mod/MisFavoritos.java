package com.keatnis.mod;

public class MisFavoritos {
    public void addFavoritos(Cancion titulo){
        if (titulo.getClasificacion() >=8 ){
            System.out.println(titulo.getTitulo() + "Es uno de los favoritos");
        }else{
            System.out.println("Es menos favorito pero puede no se queda atras");
        }

    }
}
