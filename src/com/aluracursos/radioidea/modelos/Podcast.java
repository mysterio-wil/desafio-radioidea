package com.aluracursos.radioidea.modelos;

public class Podcast extends Audio {
    private String presentador;
    private String descripcion;
    private String categoria;

    @Override
    public int getClasificacion() {
       if (getTotalReproducciones() >= 2000) {
           return 9;
       } else {
           return 2;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
