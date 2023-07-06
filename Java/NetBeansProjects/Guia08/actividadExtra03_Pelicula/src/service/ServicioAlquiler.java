package service;

import entidad.Alquiler;
import entidad.Pelicula;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ServicioAlquiler {
    
    ServicioPelicula servPelicula = new ServicioPelicula();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler alquilarPelicula(Pelicula[] arregloPelis) {

            System.out.println("¿Qué película desea alquilar?");
            String titulo = input.nextLine();
            
            int indice = servPelicula.buscarTitulo(arregloPelis, titulo);
            if (indice >=0) {
                
                Pelicula newPelicula = arregloPelis[indice];
                if (!newPelicula.isAlquilada()) {
                    
                    newPelicula.setAlquilada(true);
                    
                    System.out.println("Indique la fecha de alquiler (año, mes, día):");
                    LocalDate fechaInicio = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
                    input.nextLine();
                    
                    System.out.println(newPelicula.getTitulo() + " ha sido alquilada");
                    return new Alquiler(newPelicula, fechaInicio);

                } else {
                    
                    System.out.println("¡Ups! La película ya está alquilada.");
                    return null;
                    
                }
                
            } else {
                System.out.println("La película no se encuentra en nuestro sistema.");
                return null;
            }

    }

    public void listaAlquileres(Alquiler[] newAlquiler) {
        
        String listaPelisAlquiladas = "";
        for (int i=0; i< newAlquiler.length; i++) {
            if (newAlquiler[i] != null && newAlquiler[i].getPeliAlquilada().isAlquilada()) {
                listaPelisAlquiladas += newAlquiler[i].getPeliAlquilada().getTitulo() + "\n";
            }
        }
        
        if (listaPelisAlquiladas.length() > 0) {
            System.out.println(listaPelisAlquiladas);
        } else {
            System.out.println("Aún no hay películas alquiladas.");
        }
    }
    
    public void alquileresPorFecha(Alquiler[] alquileres) {
        
        if (alquileres[0] != null) {

            System.out.println("Indique la fecha a buscar (año, mes, día):");
            LocalDate fechaBusqueda = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());

            String listaPelisAlquiladas = "";
            for (int i = 0; i < alquileres.length; i++) {
                if (alquileres[i] != null && alquileres[i].getPeliAlquilada().isAlquilada() && alquileres[i].getFechaInicio().equals(fechaBusqueda)) {
                    listaPelisAlquiladas += alquileres[i].getPeliAlquilada().getTitulo() + "\n";
                }
            }

            if (listaPelisAlquiladas.length() > 0) {
                System.out.println("Películas alquiladas en la fecha especificada (" + fechaBusqueda.toString() + "):");
                System.out.println(listaPelisAlquiladas);
            } else {
                System.out.println("No se alquilaron películas para esa fecha.");
            }

        } else {
            System.out.println("Aún no hay películas alquiladas.");
        }
        
    }
    
    public void totalesRecaudados(Alquiler[] alquileres) {
        
        if (alquileres[0] != null) {
            
            double recaudoTotal = 0;
            double precioHoy = 0;
            LocalDate fechaInicio;
            LocalDate fechaMax;
            for (int i = 0; i < alquileres.length; i++) {
                if (alquileres[i] != null && alquileres[i].getPeliAlquilada().isAlquilada()) {
                    fechaInicio = alquileres[i].getFechaInicio();
                    fechaMax = fechaInicio.plusDays(3);
                    if (LocalDate.now().isAfter(fechaMax)) {
                        precioHoy = 10 + (0.1*(ChronoUnit.DAYS.between(fechaInicio,LocalDate.now())-3)); // Los primeros tres días se cuentan a partir del siguiente día desde el que se realizó el alquiler. Por ejemplo, si el alquiler se hizo el 30 de junio, los 3 días de precio fijo empiezan a correr el 1 de julio.
                    } else {
                        precioHoy = 10;
                    }
                    recaudoTotal += precioHoy;
                }
            }
            
            System.out.println("El recaudo total es de " + recaudoTotal);

        } else {
            System.out.println("Aún no hay películas alquiladas.");
        }        
    }
    
}