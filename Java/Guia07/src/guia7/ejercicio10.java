package guia7;

import java.util.Scanner;

public class ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese números. El programa se detendrá una vez la suma de estos toque un tope.");
        int num = input.nextInt();
        
        int sum = 0;
        int max = 51;
        
        while (sum < max) {
            sum = sum + num;
            
            System.out.println("Ingrese números. El programa se detendrá una vez la suma de estos toque un tope.");
            num = input.nextInt();
        }

        System.out.println("Has superado el límite inicial.");
    }
    
}
