package ejercicio01;

import entidad.Libro;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Libro l1 = new Libro();
        
        l1.añadirDatos();
        
        l1.mostrarDatos();
        
    }
    
}
