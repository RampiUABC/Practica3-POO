package org.example;

public class Pelicula {
    private String titulo;
    private String director;
    private int anioEstreno;
    private String genero;
    private int duracion;

    //Constructor
    public Pelicula(String titulo, String director, int anioEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getInformacion() {
        return "Título: " + this.titulo + ", Director: " + this.director +
                ", Año: " + this.anioEstreno + ", Género: " + this.genero +
                ", Duración: " + this.duracion + " min.";
    }

    // Determina si es clasica
    public boolean esClasica() {
        int antiguedad = 2026 - this.anioEstreno;

        if (antiguedad > 25) {
            return true;
        } else {
            return false;
        }
    }

    // Getter para poder leer el título desde la clase Catalogo
    public String getTitulo() {
        return this.titulo;
    }

    public String toString() {
        return getInformacion();
    }
}
