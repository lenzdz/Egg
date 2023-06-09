package guia7;

import java.util.Arrays;

public class ejercicio15 {
    
    public static void main(String[] args) {
        
        int[] vector;
        
        vector = llenarVector();
        System.out.println(Arrays.toString(vector));
        // printArray(vector);
        
    }
    
    public static int[] llenarVector() {
        
        int[] vector = new int[100];
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        
        return vector;   
    }
    
    public static void printArray(int[] vector) {
        
        for (int i = 99; i >= 0; i--) {
            System.out.println("[" + vector[i] + "]");
        }
        
    }
    
}
