/**
 * 
 * Hice este ejercicio con la clase Date (obsoleta, pero solicitada en la guía 8) y con la clase Time (vigente hoy día para manejar objetos de tipo fecha)
 * Encontré la información con la que me guié respecto a la clase Time aquí: https://www.arteco-consulting.com/post/introduccion-a-java-time
 * 
 */

package ejercicio11_date;

import java.time.*; // El asterisco importa todo el API
//import java.util.Date;
import java.util.Scanner;

public class Ejercicio11_Date {

//    public static void main(String[] args) {
//        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Ingrese día, mes y año:");
//        int dia = input.nextInt();
//        int mes = input.nextInt();
//        int anio = input.nextInt();
//        
//        Date fecha = new Date(anio, mes, dia);
//        System.out.println(fecha);
//        
//        Date fechaActual = new Date();
//        System.out.println("La cantidad de años entre la fecha ingresada y hoy es de " + (fechaActual.getYear() - fecha.getYear()) + " año(s).");
//        
//    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese día, mes y año:");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int anio = input.nextInt();
        
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        System.out.println(fecha);
        
        LocalDate fechaActual = LocalDate.now();
        System.out.println("La cantidad de años entre la fecha ingresada y hoy es de " + (fechaActual.getYear() - fecha.getYear()) + " año(s).");
        
    }
    
}
