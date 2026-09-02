package org.example;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Pelicula> peliculas;

    // CONSTRUCTOR
    public Catalogo() {
        this.peliculas = new ArrayList<Pelicula>();
    }

    // Agrega una película a la lista
    public void agregarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula); // add() mete la película
        System.out.println("Pelicula agregada con éxito al catálogo.");
    }

    // Regresa una cadena con todas las películas
    public String getPeliculas() {
        String resultado = "Peliculas en el catalogo:\n";

        // peliculas.size() nos dice el numeri de peliculas
        for (int i = 0; i < this.peliculas.size(); i++) {
            resultado = resultado + this.peliculas.get(i).getInformacion() + "\n";
        }

        return resultado;
    }

    // Busca una pelicula por título y muestra su información
    public void buscarPeliculaPorTitulo(String tituloBuscado) {
        boolean encontrada = false;

        for (int i = 0; i < this.peliculas.size(); i++) {
            if (this.peliculas.get(i).getTitulo().equalsIgnoreCase(tituloBuscado)) {
                System.out.println("Pelicula Encontrada:");
                System.out.println(this.peliculas.get(i).getInformacion());
                encontrada = true;
                break;
            }
        }
        if (encontrada == false) {
            System.out.println("No se encontro la película con el título: " + tituloBuscado);
        }
    }
}