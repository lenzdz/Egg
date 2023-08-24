package service;

import entidad.Pelicula;

public class ServicioPelicula {
    
    public Pelicula crearPelicula(String titulo, String genero, int anio, int duracion) {

        return new Pelicula(titulo, genero, anio, duracion);
    }

    public void listaPelisDisponibles(Pelicula[] newPeliculas) {

        if (newPeliculas[0] == null) {
            System.out.println("Aún no se han cargado películas al sistema.");
        } else {
            for (int i=0; i < newPeliculas.length; i++) {
                if (newPeliculas[i] != null && (!newPeliculas[i].isAlquilada())) {
                    System.out.println(newPeliculas[i].getTitulo());
                }
            }
        }
        
    }

    public int buscarTitulo(Pelicula[] arregloPeli, String titulo) {
        for (int i = 0; i < arregloPeli.length; i++) {
            if (arregloPeli[i].getTitulo().equals(titulo)) {
                return i;
            }
        }
        return -1;
    }
    
    public void buscarGenero(Pelicula[] arregloPeli, String genero) {
        
        String coincidencias = "";
        for (int i = 0; i < arregloPeli.length; i++) {
            if (arregloPeli[i].getGenero().equals(genero)) {
                coincidencias += arregloPeli[i].getTitulo() + "\n";
            }
        }
        
        if (coincidencias.length() > 0) {
            System.out.println("Película(s) que coincide(n) con la búsqueda por género: " + genero.toUpperCase());
            System.out.println(coincidencias);
        } else {
            System.out.println("No hay coincidencias para este género.");
        }
        
    }

    public void isAlquilada(Pelicula newPelicula) {
        if (newPelicula.isAlquilada()) {
            System.out.println("La película está alquilada.");
        } else{
            System.out.println("La película está disponible.");
        }
    }
    
}
