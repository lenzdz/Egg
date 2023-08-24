package guia7;

import java.util.Scanner;

public class ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }

}
