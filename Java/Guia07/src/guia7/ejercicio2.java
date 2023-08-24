package guia7;

import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu nombre?");
        String name = input.nextLine();
        
        System.out.println("Tu nombre es " + name);
    }
    
}
