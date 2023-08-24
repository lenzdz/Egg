package guia7;

public class ejercicio19 {
    
    public static void main(String[] args) {
        
        int[][] array = new int[3][3];
        
        // Fila #1
        array[0][0] = 0;
        array[0][1] = -2;
        array[0][2] = 4;
        
        // Fila #2
        array[1][0] = 2;
        array[1][1] = 0;
        array[1][2] = 2;
        
        // Fila #3
        array[2][0] = -4;
        array[2][1] = -2;
        array[2][2] = 0;
        
        System.out.println("La matriz es antisimétrica: " + isAntiSymmetrical(array));
    }
    
    public static boolean isAntiSymmetrical(int[][] array) {
        
        int[][] transposed = new int[3][3];
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                transposed[j][i] = array[i][j];
            }
        }
        
        boolean res = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] != -(transposed[i][j])) {
                    res = false;
                }
            }
        }
        
        return res;
        
    }
    
}