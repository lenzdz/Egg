package guia7;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        double num = input.nextDouble();
        
        System.out.println("Doble: " + num*2);
        System.out.println("Triple: " + num*3);
        System.out.println("Raíz: " + Math.sqrt(num));
        
    }

}
