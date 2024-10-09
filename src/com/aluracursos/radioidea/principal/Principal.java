package com.aluracursos.radioidea.principal;

import com.aluracursos.radioidea.modelos.Cancion;
import com.aluracursos.radioidea.modelos.MisFaviritos;
import com.aluracursos.radioidea.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Café.Tech");

        //cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproducir();
        }

        //podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproducir();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMeGusta());

        MisFaviritos favoritos =new MisFaviritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
