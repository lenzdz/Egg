package services;

import entities.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisesServices {
    
    Scanner input = new Scanner(System.in, "Windows-1252");
    TreeSet<Pais> conjuntoPaises = new TreeSet();
    
    public void crearPais() {
        
        String choice;
        do {
            
            System.out.println("Ingrese el nombre del país:");
            String nombre = input.nextLine().toUpperCase();

            Pais country = new Pais(nombre);
            conjuntoPaises.add(country);
            
            do {
                System.out.println("¿Desea ingresar otro país? (s/n)");
                choice = input.nextLine().toLowerCase();
                
                if (!choice.equals("s") && !choice.equals("n")) {
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                }
            } while (!choice.equals("s") && !choice.equals("n"));
            
        } while (choice.equals("s"));
        
    }
    
    public void mostrarPaises() {
        
        System.out.println("\nSu lista de paises incluye:");
        for (Pais country : conjuntoPaises) {
            System.out.println(country);
        }
        
    }
    
    public void eliminarPais() {
        
        System.out.println("\nSe procederá a eliminar el país de su elección:");
        String nombreEliminar = input.nextLine().toUpperCase();
        
        Pais paisEliminar = new Pais(nombreEliminar);
        
        if (conjuntoPaises.contains(paisEliminar)) {
            conjuntoPaises.remove(paisEliminar);
            System.out.println(nombreEliminar + " se ha eliminado exitosamente.");
        } else {
            System.out.println(nombreEliminar + " no se ha encontrado.");
        }

//        Iterator iterator = conjuntoPaises.iterator();
//        
//        boolean flag = false;
//        while (iterator.hasNext()) {
//            if (iterator.next().equals(paisEliminar)) {
//                iterator.remove();
//                flag = true;
//            }
//        }
//        
//        if (flag) {
//            System.out.println(nombreEliminar + " se ha eliminado exitosamente.");
//        } else {
//            System.out.println(nombreEliminar + " no se ha encontrado.");
//        }
        
    }
    
}
