
package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Primer número");
        int num1 = sc.nextInt();
        
        System.out.println("Segundo número");
        int num2 = sc.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos son mayores que 25");
        } else if (num1 > 25) {
            System.out.println("El primer número es mayor que 25");
        } else if (num2 > 25) {
            System.out.println("El segundo número es mayor que 25");
        } else {
            System.out.println("Ningún número es mayor que 25");
        }
    }  
}
