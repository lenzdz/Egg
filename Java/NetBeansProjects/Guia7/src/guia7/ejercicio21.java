package guia7;

public class ejercicio21 {
    
    public static void main(String[] args) {
        
        int[][] array;
        array = fillArray1();
        
        int[][] smallArray;
        smallArray = fillArray2();
        
        boolean answer;
        isInside(array, smallArray);

    }
    
    public static int[][] fillArray1 () {
        
        int[][] matrix = new int[10][10];
        
        // Row #1
        matrix[0][0] = 1;
        matrix[0][1] = 26;
        matrix[0][2] = 36;
        matrix[0][3] = 47;
        matrix[0][4] = 5;
        matrix[0][5] = 6;
        matrix[0][6] = 72;
        matrix[0][7] = 81;
        matrix[0][8] = 95;
        matrix[0][9] = 10;
        
        // Row #2
        matrix[1][0] = 11;
        matrix[1][1] = 12;
        matrix[1][2] = 13;
        matrix[1][3] = 21;
        matrix[1][4] = 41;
        matrix[1][5] = 22;
        matrix[1][6] = 67;
        matrix[1][7] = 20;
        matrix[1][8] = 10;
        matrix[1][9] = 61;
        
        // Row #3
        matrix[2][0] = 56;
        matrix[2][1] = 78;
        matrix[2][2] = 87;
        matrix[2][3] = 90;
        matrix[2][4] = 9;
        matrix[2][5] = 90;
        matrix[2][6] = 17;
        matrix[2][7] = 12;
        matrix[2][8] = 87;
        matrix[2][9] = 67;
        
        // Row #4
        matrix[3][0] = 41;
        matrix[3][1] = 87;
        matrix[3][2] = 24;
        matrix[3][3] = 56;
        matrix[3][4] = 97;
        matrix[3][5] = 74;
        matrix[3][6] = 87;
        matrix[3][7] = 42;
        matrix[3][8] = 64;
        matrix[3][9] = 35;
        
        // Row #5
        matrix[4][0] = 32;
        matrix[4][1] = 76;
        matrix[4][2] = 79;
        matrix[4][3] = 1;
        matrix[4][4] = 36;
        matrix[4][5] = 5;
        matrix[4][6] = 67;
        matrix[4][7] = 96;
        matrix[4][8] = 12;
        matrix[4][9] = 11;
        
        // Row #6
        matrix[5][0] = 99;
        matrix[5][1] = 13;
        matrix[5][2] = 54;
        matrix[5][3] = 88;
        matrix[5][4] = 89;
        matrix[5][5] = 90;
        matrix[5][6] = 75;
        matrix[5][7] = 12;
        matrix[5][8] = 41;
        matrix[5][9] = 76;
        
        // Row #7
        matrix[6][0] = 67;
        matrix[6][1] = 78;
        matrix[6][2] = 87;
        matrix[6][3] = 45;
        matrix[6][4] = 14;
        matrix[6][5] = 22;
        matrix[6][6] = 26;
        matrix[6][7] = 42;
        matrix[6][8] = 56;
        matrix[6][9] = 78;
        
        // Row #8
        matrix[7][0] = 98;
        matrix[7][1] = 45;
        matrix[7][2] = 34;
        matrix[7][3] = 23;
        matrix[7][4] = 32;
        matrix[7][5] = 56;
        matrix[7][6] = 74;
        matrix[7][7] = 16;
        matrix[7][8] = 19;
        matrix[7][9] = 18;
        
        // Row #9
        matrix[8][0] = 24;
        matrix[8][1] = 67;
        matrix[8][2] = 97;
        matrix[8][3] = 46;
        matrix[8][4] = 87;
        matrix[8][5] = 13;
        matrix[8][6] = 67;
        matrix[8][7] = 89;
        matrix[8][8] = 93;
        matrix[8][9] = 24;
        
        // Row #10
        matrix[9][0] = 21;
        matrix[9][1] = 68;
        matrix[9][2] = 78;
        matrix[9][3] = 98;
        matrix[9][4] = 90;
        matrix[9][5] = 67;
        matrix[9][6] = 12;
        matrix[9][7] = 41;
        matrix[9][8] = 65;
        matrix[9][9] = 12;
        
        return matrix;
        
    }
    
    public static int[][] fillArray2() {
        
        int[][] matrix = new int[3][3];
        
        // Row #1
        matrix[0][0] = 36;
        matrix[0][1] = 5;
        matrix[0][2] = 67;
        
        // Row #2
        matrix[1][0] = 89;
        matrix[1][1] = 90;
        matrix[1][2] = 75;
        
        // Row #3
        matrix[2][0] = 14;
        matrix[2][1] = 22; // 22 original
        matrix[2][2] = 26;
        
        return matrix;
        
    }
    
    public static void isInside(int[][] matrix, int[][] smallMatrix) {

        int tempI;
        int tempJ;
        String location;
        String finalLocation = "";
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                
                if (matrix[i][j] == smallMatrix[0][0]) {
                    
                    location = "";
                    tempI = i;
                    tempJ = j;
                    
                    for (int m = 0; m < 3; m++) {
                        for (int n = 0; n < 3; n++) {
                            
                            if (smallMatrix[m][n] != matrix[i][j]) {
                                m = 3;
                                break;
                            }
                            
                            location = location + "[" + i + ", " + j + "]  ";
                            
                            j++;
                        }
                        i++;
                        j = tempJ;
                    }
                    
                    if (location.length() > finalLocation.length() && (i == tempI+3)) {
                        finalLocation = location;
                    }
                    
                    // Se necesita retornar a los valores para seguir recorriendo el bucle sin saltar casillas
                    i = tempI;
                    j = tempJ;
                }
            }
        }
        
        if (finalLocation.length() > 0) {
            System.out.println("La matriz P se encuentra en la matriz M.");
            System.out.println("Posición: " + finalLocation);
        } else {
            System.out.println("La matriz P no se encuentra en la matriz M.");
        }
        
    }
    
}