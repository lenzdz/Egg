package guia7;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ejercicio16 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Indique el tamaño para su vector:");
        int dim = input.nextInt();
        
        Integer[] array;
        
        array = fillArray(dim);
        System.out.println(Arrays.toString(array));
        
        System.out.println("Ingrese un número para buscar en el arreglo:");
        int searchValue = input.nextInt();
        
        checkInArray(array, dim, searchValue);
        
    }
    
    public static Integer[] fillArray(int dim) {
    
        Random random = new Random();
        
        Integer[] array = new Integer[dim];
        
        for (int i = 0; i < dim; i++) {
            array[i] = random.nextInt(11);
        }
        
        return array;
    
    }
    
    public static void checkInArray(Integer[] array, int dim, int searchValue) {
        
        boolean test = Arrays.asList(array).contains(searchValue);
        String res = "";
        
        if (test) {
            
            for (int i = dim-1; i >=0; i--) {
                if (array[i] == searchValue) {
                    switch (res.length()) {
                        case 0:
                            res = Integer.toString(i);
                            break;
                        case 1:
                            res = Integer.toString(i) + " y " + res;
                            break;
                        default:
                            res = Integer.toString(i) + ", " + res;
                            break;
                    }
                }
            }
            
            if (res.length() > 1) {
                System.out.println("El número que buscas se encuentra en los índices " + res);
            } else  {
                System.out.println("El número que buscas se encuentra en el índice " + res);
            }
            
        } else {
            System.out.println("El número que buscas no se encuentra en el arreglo.");
        }
        
    }
    
}