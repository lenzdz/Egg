package guia7;

import java.util.Scanner;

public class ejercicio13 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su cuadrado:");
        int num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == num) {
                    System.out.println("*");
                } else if (i == 1 || j == 1 || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        
    }
    
}