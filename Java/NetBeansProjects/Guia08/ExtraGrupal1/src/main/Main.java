package main;

import entidad.Alquiler;
import entidad.Pelicula;
import service.ServicioAlquiler;
import service.ServicioPelicula;
import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        menu();





    }

    public static void menu() {
        int opcion;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ServicioPelicula servPelicula = new ServicioPelicula();
        ServicioAlquiler servAlquiler = new ServicioAlquiler();
        Pelicula[] arregloPelis = new Pelicula[5];
        Alquiler[] arregloAlquiler = new Alquiler[3];



        do {
            System.out.println("-----------------------");
            System.out.println("MENU ALQUILER PELICULAS");
            System.out.println("-----------------------");
            System.out.println("1. Cargar pelicula");
            System.out.println("2. Ver peliculas disponibles");
            System.out.println("3. Alquilar pelicula");
            System.out.println("4. Listado de alquileres");
            System.out.println("5. Buscar peliculas");
            System.out.println("6. Buscar alquileres por fecha");
            System.out.println("7. Ver totales recaudados");
            System.out.println("9. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    arregloPelis[0] = servPelicula.crearPelicula("Avatar", "Accion", 2009, 110);
                    arregloPelis[1] = servPelicula.crearPelicula("Harry Potter", "Aventura", 2009, 162);
                    arregloPelis[2] = servPelicula.crearPelicula("El padrino", "Drama", 2000, 130);
                    arregloPelis[3] = servPelicula.crearPelicula("Avatar 2", "Accion", 2021, 95);
                    arregloPelis[4] = servPelicula.crearPelicula("El señor de los anillos", "Accion", 2009, 156);
                    System.out.println("Se cargaron las películas correctamente");
                    System.out.println(Arrays.toString(arregloPelis));

                    //cargar Peli
                    break;
                case 2:
                    servPelicula.listaPelisDisponibles(arregloPelis);
                    break;
                case 3:
                    arregloAlquiler[0] = servAlquiler.alquilarPelicula(arregloPelis[1], LocalDate.now());
                    arregloAlquiler[1] = servAlquiler.alquilarPelicula(arregloPelis[4], LocalDate.now());
                    break;
                case 4:
                    servAlquiler.listaAlquileres(arregloAlquiler);
                    break;
                case 5:
                    System.out.println("Ver película por: 1. TÍTULO 2. GÉNERO");
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println("Introducir nombre película");
                            int indice = servPelicula.buscarObjeto(arregloPelis, scanner.next());
                            if (indice >=0) {
                                servPelicula.getNombrePelicula(arregloPelis[indice]);
                                servPelicula.isAlquilada(arregloPelis[indice]);
                            } else {
                                System.out.println("No hay coincidencias");
                            }
                        case 2:

                    }
                    break;
                case 6:
                    //buscar alquileres por fecha
                    break;
                case 7:
                    // ver totales recaudados
                    break;
                case 9:
                    //salir
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 9);





    }
}
