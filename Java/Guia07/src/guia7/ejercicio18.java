package guia7;

import java.util.Random;

public class ejercicio18 {
    
    public static void main(String[] args) {
        
        int[][] array;
        array = fillArray();
        
        printArray(array);
        
        int[][] transposedArray;
        transposedArray = fillTransposed(array);
        
        System.out.println("Transpuesta");
        printArray(transposedArray);
        
    }
    
    public static int[][] fillArray() {
        
        Random random = new Random();
        
        int[][] matrix = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(11);
            }
        }
        
        return matrix;
    }
    
    public static int[][] fillTransposed(int[][] array) {
        
        int[][] transposed = new int[4][4];
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                transposed[j][i] = array[i][j];
            }
        }
        
        return transposed;
        
    }
    
    public static void printArray(int[][] matrix) {
        
        String row = "";
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        row = "[" + Integer.toString(matrix[i][j]) + ", ";
                        break;
                    case 4-1:
                        row = row + Integer.toString(matrix[i][j]) + "]";
                        break;
                    default:
                        row = row + Integer.toString(matrix[i][j]) + ", ";
                        break;
                }
            }
            System.out.println(row);
            row = "";
        }
        
    }
    
}