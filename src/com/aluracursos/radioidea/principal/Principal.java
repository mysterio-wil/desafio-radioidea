package com.aluracursos.radioidea.principal;

import com.aluracursos.radioidea.modelos.Cancion;
import com.aluracursos.radioidea.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Café.Tech");
    }
}
