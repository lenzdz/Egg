package guia7;

import java.util.Scanner;

public class ejercicio20 {
    
    public static void main(String[] args) {
        
        int[][] array;
        
        array = fillArray();
        
        boolean res;
        res = isMagical(array);
        
        System.out.println("La matriz es mágica: " + res);
        
    }
    
    public static int[][] fillArray() {
        
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese el elemento de la posición [" + i + ", " + j + "].");
                    matrix[i][j] = input.nextInt();
                } while (matrix[i][j] > 9 || matrix[i][j] < 0);
            }
        }
        
        return matrix;
        
    }
    
    public static boolean isMagical(int[][] matrix) {
        
        boolean res = true;
        
        int principalSum = 0;
        int sumRow = 0;
        int sumCol = 0;
        int sumFirstDiag = 0;
        int sumSeconDiag = 0;
        
        System.out.println("Entro a primera");
        // Check rows
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                sumRow = sumRow + matrix[i][j];
            }
            //System.out.println(sumRow);
            if (i == 0) {
                principalSum = sumRow;
                sumRow = 0;
            } else if (principalSum != sumRow) {
                res = false;
                return res;
            } else {
                sumRow = 0;
            }
            
        }
        System.out.println("Pasé primera");
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            
            for (int i = 0; i < 3; i++) {
                sumCol = sumCol + matrix[i][j];
            }
            
            if (principalSum != sumCol) {
                res = false;
                return res;
            } else {
                sumCol = 0;
            }
            
        }
        System.out.println("Pasé segunda");
        
        // Check principal diagonal
        for (int i = 0; i < 3; i++) {
            sumFirstDiag = sumFirstDiag + matrix[i][i];
        }
        
        if (principalSum != sumFirstDiag) {
            res = false;
            return res;
        }
        System.out.println("Pasé tercera");
        
        // Check secondary diagonal
        int j = 2;
        for (int i = 0; i < 3; i++) {
            sumSeconDiag = sumSeconDiag + matrix[i][j];
            j--;
        }
        
        if (principalSum != sumSeconDiag) {
            res = false;
            return res;
        }
        System.out.println("Pasé cuarta");
        
        return res;
    }
    
}