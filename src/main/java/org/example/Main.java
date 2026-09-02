package org.example;

public class Main {
    public static void main(String[] args) {
        Catalogo miCatalogo = new Catalogo();

        // Crea 3 objetos Pelicula
        Pelicula p1 = new Pelicula("Matrix", "Lana y Lilly Wachowski", 1999, "Ciencia Ficción", 136);
        Pelicula p2 = new Pelicula("Dune", "Denis Villeneuve", 2021, "Ciencia Ficción", 155);
        Pelicula p3 = new Pelicula("El Padrino", "Francis Ford Coppola", 1972, "Drama", 175);

        // aniade las pelicilas al catalogo
        miCatalogo.agregarPelicula(p1);
        miCatalogo.agregarPelicula(p2);
        miCatalogo.agregarPelicula(p3);

        System.out.println();

        System.out.println(miCatalogo.getPeliculas());

        // Buscar películas por título
        System.out.println("(prueba de busqueda)");
        miCatalogo.buscarPeliculaPorTitulo("Dune");

        System.out.println();
        miCatalogo.buscarPeliculaPorTitulo("Shrek"); // Esta no existe, probará el mensaje de no encontrada

        System.out.println("\n--- Pruebas de Antigüedad (esClasica) ---");
        System.out.println("¿Es 'El Padrino' clásica? " + p3.esClasica());
        System.out.println("¿Es 'Dune' clásica? " + p2.esClasica());
    }
}