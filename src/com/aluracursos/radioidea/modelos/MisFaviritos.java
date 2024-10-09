package com.aluracursos.radioidea.modelos;

public class MisFaviritos {
    public void adicione(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " Está en camino a ser uno de los favoritos");
        }
    }
}
