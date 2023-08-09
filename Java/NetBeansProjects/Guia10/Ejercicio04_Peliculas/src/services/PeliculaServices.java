package services;

import entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

public class PeliculaServices {
    
    Scanner input = new Scanner(System.in);
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    
    public void menuCine() {
        
        int choice;
        do {
            
            System.out.println("MENÚ DE PELÍCULAS");
            System.out.println("Seleccione la opción deseada:");
            
            System.out.println("1) Agregar una nueva película");
            System.out.println("2) Mostrar películas");
            System.out.println("3) Salir");
            
            choice = input.nextInt();
            input.nextLine();
            
            switch (choice) {
                case 1:
                    // crearPeliculaManual();
                    crearPeliculaAuto();
                    break;
                case 2:
                    if (listaPeliculas.size() > 0) {
                        mostrarPeliculas();
                    } else {
                        System.out.println("Aún no se han agregado películas al sistema.\n");
                    }
                    break;
                case 3:
                    continue;
                default:
                    System.out.println("Opción inválida. Vuelva a intentarlo.\n");
                    break;
            }
            
        } while (choice != 3);
        
    }
    
    public void crearPeliculaManual() {
        
        String choice;
        do {
        
        System.out.println("\nIngrese el nombre de la película:");
        String titulo = input.nextLine().toUpperCase();
        
        System.out.println("Ingrese el director de la película:");
        String director = input.nextLine().toUpperCase();
        
        System.out.println("Ingrese la duración de la película:");
        int duracion = input.nextInt();
        input.nextLine();
        
        Pelicula nuevaPeli = new Pelicula(titulo, director, duracion);
        listaPeliculas.add(nuevaPeli);
        
        do {
            
            System.out.println("¿Desea agregar otra película? (s/n)");
            choice = input.nextLine().toUpperCase();
            
            if (!choice.equals("s") && !choice.equals("n")) {
                System.out.println("Opción inválida. Vuelva a intentarlo.");
            }
            
        } while (!choice.equals("s") && !choice.equals("n"));
        
        } while (choice.equals("s"));
        
    }
    
    /*
        Método para no tener que crear una a una las películas y facilitar las pruebas del proyecto.
    */    
    public void crearPeliculaAuto() {
        
        listaPeliculas.add(new Pelicula("BARBIE", "GRETA GERWIG", 114));
        listaPeliculas.add(new Pelicula("PONYO", "HAYAO MIYAZAKI", 103));
        listaPeliculas.add(new Pelicula("LA LA LAND", "DAMIEN CHAZELLE", 128));
        listaPeliculas.add(new Pelicula("HACIA EL BOSQUE DE LAS LUCIÉRNAGAS", "TAKAHIRO OMORI", 44));
        listaPeliculas.add(new Pelicula("YO, TONYA", "CRAIG GILLESPIE", 120));
        System.out.println("");
        
    }
    
    public void mostrarPeliculas() {
        
        int choice;
        do {
            
            System.out.println("\nIndique qué películas desea ver:");
            System.out.println("1) Todas");
            System.out.println("2) Más de 1 hora de duración");
            choice = input.nextInt();
            input.nextLine();
            
            if (choice != 1 && choice != 2) {
                System.out.println("Opción inválida. Vuelva a intentarlo.");
            }
            
        } while (choice != 1 && choice != 2);
        
        
        if (choice == 1) {
            
            do {
            
                System.out.println("\nSeleccione en qué orden desea ver la lista de películas:");
                System.out.println("1) Por título en orden alfabético");
                System.out.println("2) Por director en orden alfabético");
                System.out.println("3) Mayor a menor duración");
                System.out.println("4) Menor a mayor duración");
                choice = input.nextInt();
                input.nextLine();
                
                if (choice < 1 || choice > 4) {
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                }
                
            } while (choice < 1 || choice > 4);
                
            switch (choice) {
                case 1:
                    Collections.sort(listaPeliculas, Comparadores.ordenarPorTitulo_AZ);
                    for (Pelicula aux : listaPeliculas) {
                        System.out.println(aux);
                    }
                    System.out.println("");
                    break;
                case 2:
                    Collections.sort(listaPeliculas, Comparadores.ordenarPorDirector_AZ);
                    for (Pelicula aux : listaPeliculas) {
                        System.out.println(aux);
                    }
                    System.out.println("");
                    break;
                case 3:
                    Collections.sort(listaPeliculas, Comparadores.ordenarPorDuracion_Mm);
                    for (Pelicula aux : listaPeliculas) {
                        System.out.println(aux);
                    }
                    System.out.println("");
                    break;
                case 4:
                    Collections.sort(listaPeliculas, Comparadores.ordenarPorDuracion_mM);
                    for (Pelicula aux : listaPeliculas) {
                        System.out.println(aux);
                    }
                    System.out.println("");
                    break;
            }

        } else {
            
            Collections.sort(listaPeliculas, Comparadores.ordenarPorTitulo_AZ);
            for (Pelicula aux : listaPeliculas) {
                if (aux.getDuracion() >= 60) {
                    System.out.println(aux);
                }
            }
            System.out.println("");
            
        }
        
        
        
    }
    
}
