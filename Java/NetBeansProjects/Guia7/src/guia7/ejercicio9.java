package guia7;

import java.util.Scanner;

public class ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = input.nextLine();
        
        if (frase.substring(0,1).equalsIgnoreCase("a")) {
            System.out.println("La oración comienza con A");
        } else {
            System.out.println("La oración no comienza con A");
        }
        
    }
    
}