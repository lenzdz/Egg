package guia7;

import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una temperatura en Celcius:");
        double tempC = input.nextDouble();
        
        double tempF = 32 + (9*tempC/5);
        
        System.out.println("La temperatura en Farenheit es " + tempF);
        
    }
  
}
