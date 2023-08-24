package perros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerrosMain {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> perritos = new ArrayList();
        
        String raza;
        boolean flag = true;
        
        do {
            
            System.out.println("Escriba el nombre de la raza a añadir:");
            raza = input.nextLine().toLowerCase();
            perritos.add(raza);
            
            System.out.println("¿Desea ingresar otra raza? (s/n)");
            if (input.nextLine().equalsIgnoreCase("n")) {
                flag = false;
            }
            
        } while (flag);
        
        System.out.println("Las razas ingresadas fueron:");
        System.out.println(perritos);
        
        Iterator iterator = perritos.iterator();
        
        System.out.println("\nEscriba una raza para eliminarla:");
        String razaEliminar = input.nextLine().toLowerCase();
        
        while (iterator.hasNext()) {
            if (iterator.next().equals(razaEliminar)) {
                iterator.remove();
                flag = true;
            }
        }
        
        if (flag) {
            System.out.println("El elemento fue eliminado exitosamente.");
        } else {
            System.out.println("No se encontró el elemento en la colección.");
        }
        
        System.out.println("Las razas actualizadas en la colección son:");
        System.out.println(perritos);
        
    }
    
}
