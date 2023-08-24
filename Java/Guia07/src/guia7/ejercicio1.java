package guia7;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el número #1:");
        int num1 = input.nextInt();
        
        System.out.println("Ingrese el número #2");
        int num2 = input.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los dos números es: " + suma);
    }
    
}
