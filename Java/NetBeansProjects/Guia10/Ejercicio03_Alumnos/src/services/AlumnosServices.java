package services;

import entities.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosServices {
    
    Scanner input = new Scanner(System.in);
    ArrayList<Alumnos> listaAlumnos = new ArrayList();
    
    public void crearAlumnos() {
        
        Alumnos estudiante;
        boolean flag = true;
        
        do {
        
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = input.nextLine().toLowerCase();
            
            Integer[] calificaciones = new Integer[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la calificación #" + (i+1) + " del estudiante:");
                calificaciones[i] = input.nextInt();
            }
            input.nextLine();
            
            estudiante = new Alumnos(nombre, calificaciones);
            listaAlumnos.add(estudiante);
            
            String choice;
            do {
                
                System.out.println("¿Desea ingresar otro alumno? (s/n)");
                choice = input.nextLine().toLowerCase();
                
                if (!choice.equals("s") && !choice.equals("n")) {
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                } else if (choice.equals("n")) {
                    flag = false;
                }
                
            } while (!choice.equals("s") && !choice.equals("n"));
            
        } while (flag);
        
    }
    
    public void mostrarAlumnos() {
        
        System.out.println(listaAlumnos);
    }
    
    public int verificarExistencia() {
        
        System.out.println("Ingrese el nombre del alumno a buscar:");
        String nombreBusqueda = input.nextLine().toLowerCase();
        
        int index = -1;
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equals(nombreBusqueda)) {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public void notaFinal() {
        
        int index = verificarExistencia();
        
        if (index >= 0) {
            
            Integer suma = 0;
            for (int i = 0; i < 3; i++) {
                suma += listaAlumnos.get(index).getCalificaciones()[i];
            }
            
            Double notaFinal = Double.valueOf(suma) / 3;
            
            System.out.println("La nota final de " + listaAlumnos.get(index).getNombre() + " es " + notaFinal + ".");
            
        } else {
            System.out.println("El alumno no existe.");
        }
        
    }
    
}
