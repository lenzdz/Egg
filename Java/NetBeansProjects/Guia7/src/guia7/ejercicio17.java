package guia7;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ejercicio17 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la dimensión de su vector:");
        int dim = input.nextInt();
        
        int[] array;
        array = fillArray(dim);
        
        System.out.println(Arrays.toString(array));
        
        checkDigits(array, dim);
        
    }
    
    public static int[] fillArray(int dim) {
        
        Random random = new Random();
        
        int[] array = new int[dim];
        
        array[0] = 368;
        array[1] = 5;
        for (int i = 2; i < dim; i++) {
            array[i] = random.nextInt(11000);
        }
        
        return array;
        
    }
    
    public static void checkDigits(int[] array, int dim) {
        
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        
        for (int i = 0; i < dim; i++) {
            switch (Integer.toString(array[i]).length()) {
                case 1:
                    counter1++;
                    break;
                case 2:
                    counter2++;
                    break;
                case 3:
                    counter3++;
                    break;
                case 4:
                    counter4++;
                    break;
                case 5:
                    counter5++;
                    break;
            }
        }
        
        System.out.println(counter1 + " números de 1 dígito.");
        System.out.println(counter2 + " números de 2 dígitos.");
        System.out.println(counter3 + " números de 3 dígitos.");
        System.out.println(counter4 + " números de 4 dígitos.");
        System.out.println(counter5 + " números de 5 dígitos.");        
    }
    
}