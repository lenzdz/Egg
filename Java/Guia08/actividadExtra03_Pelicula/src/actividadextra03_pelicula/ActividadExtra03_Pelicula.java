package actividadextra03_pelicula;

import entidad.Alquiler;
import entidad.Pelicula;
import service.ServicioAlquiler;
import service.ServicioPelicula;
//import sun.security.util.ArrayUtil;
//import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class ActividadExtra03_Pelicula {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        
        Scanner scanner = new Scanner(System.in, "Windows-1252").useDelimiter("\n");
        ServicioPelicula servPelicula = new ServicioPelicula();
        ServicioAlquiler servAlquiler = new ServicioAlquiler();
        
        Pelicula[] arregloPelis = new Pelicula[7];
        
        int indiceNumeroDeAlquileres = 0;
        Alquiler[] arregloAlquiler = new Alquiler[3];
        
        int opcion;
        do {
            System.out.println("-----------------------");
            System.out.println("MENU ALQUILER PELICULAS");
            System.out.println("-----------------------");
            System.out.println("1. Cargar pelicula");
            System.out.println("2. Ver películas disponibles");
            System.out.println("3. Alquilar película");
            System.out.println("4. Listado de alquileres");
            System.out.println("5. Buscar películas");
            System.out.println("6. Buscar alquileres por fecha");
            System.out.println("7. Ver totales recaudados");
            System.out.println("8. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Cargar películas
                    arregloPelis[0] = servPelicula.crearPelicula("La La Land", "Romance", 2016, 128);
                    arregloPelis[1] = servPelicula.crearPelicula("Animales Nocturnos", "Suspenso", 2016, 116);
                    arregloPelis[2] = servPelicula.crearPelicula("Hacia el Boque de las Luciérnagas", "Romance", 2011, 44);
                    arregloPelis[3] = servPelicula.crearPelicula("El Regreso del Gato", "Fantasía", 2002, 75);
                    arregloPelis[4] = servPelicula.crearPelicula("Amelie", "Comedia", 2001, 122);
                    arregloPelis[5] = servPelicula.crearPelicula("Enredados", "Infantil", 2010, 100);
                    arregloPelis[6] = servPelicula.crearPelicula("Desde mi cielo", "Drama", 2008, 135);
                    System.out.println("Se cargaron las películas correctamente");
                    System.out.println(Arrays.toString(arregloPelis));
                    break;
                case 2: // Ver películas disponibles (no alquiladas)
                    servPelicula.listaPelisDisponibles(arregloPelis);
                    break;
                case 3: // Alquilar película
                    if (arregloPelis[0] == null) {
                        System.out.println("Aún no se han cargado películas al sistema.");
                    } else {
                        arregloAlquiler[indiceNumeroDeAlquileres] = servAlquiler.alquilarPelicula(arregloPelis);
                        indiceNumeroDeAlquileres++;
                    }
                    break; 
                case 4: // Ver películas alquiladas
                    if (arregloPelis[0] == null) {
                        System.out.println("Aún no se han cargado películas al sistema.");
                    } else {
                        servAlquiler.listaAlquileres(arregloAlquiler);
                    }
                    break;
                case 5: // Buscar películas por título o género
                    if (arregloPelis[0] == null) {
                        System.out.println("Aún no se han cargado películas al sistema.");
                    } else {
                        System.out.println("Buscar película por: 1. TÍTULO 2. GÉNERO. Presione cualquier otro número para regresar.");
                        int indice;
                        switch (scanner.nextInt()) {
                            case 1:
                                System.out.println("Introduzca el nombre de la película:");
                                indice = servPelicula.buscarTitulo(arregloPelis, scanner.next());
                                if (indice >=0) {
                                    servPelicula.isAlquilada(arregloPelis[indice]);
                                } else {
                                    System.out.println("No hay coincidencias.");
                                }
                                break;
                            case 2:
                                System.out.println("Introduzca el género:");
                                servPelicula.buscarGenero(arregloPelis, scanner.next());
                                break;
                        }
                    }
                    break;
                case 6: // Buscar alquileres por fecha
                    if (arregloPelis[0] == null) {
                        System.out.println("Aún no se han cargado películas al sistema.");
                    } else {
                        servAlquiler.alquileresPorFecha(arregloAlquiler);
                    }
                    break;
                case 7: // Ver totales recaudados
                    if (arregloPelis[0] == null) {
                        System.out.println("Aún no se han cargado películas al sistema.");
                    } else {
                        servAlquiler.totalesRecaudados(arregloAlquiler);
                    }
                    break;
                case 8:
                    //salir
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 8);





    }
    
}
