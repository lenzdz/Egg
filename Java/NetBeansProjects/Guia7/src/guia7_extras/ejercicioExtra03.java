package guia7_extras;

import java.util.Scanner;

public class ejercicioExtra03 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una letra:");
        String letter = input.nextLine();
        
        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es vocal.");
        } else {
            System.out.println("La letra ingresada no es vocal.");
        }
        
    }
    
}