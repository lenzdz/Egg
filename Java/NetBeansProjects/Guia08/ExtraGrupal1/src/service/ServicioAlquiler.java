package service;

import entidad.Alquiler;
import entidad.Pelicula;

import java.time.LocalDate;

public class ServicioAlquiler {
    public Alquiler alquilarPelicula(Pelicula newPelicula, LocalDate fechaInicio) {
        if (!newPelicula.isAlquilada()) {
            newPelicula.setAlquilada(true);
            System.out.println(newPelicula.getTitulo() + " ha sido alquilada");
            return new Alquiler(newPelicula, fechaInicio);

        } else{
            System.out.println("Ups! sorry rey");
            return null;
        }
    }

    public void listaAlquileres(Alquiler[] newAlquiler) {

        for (int i=0; i< newAlquiler.length; i++) {
            if (newAlquiler[i] != null && newAlquiler[i].getPeliAlquilada().isAlquilada()) {
                System.out.println(newAlquiler[i].getPeliAlquilada().getTitulo());
            }
        }
    }


}
