package guia7;

import java.util.Scanner;

public class ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        
    }

}