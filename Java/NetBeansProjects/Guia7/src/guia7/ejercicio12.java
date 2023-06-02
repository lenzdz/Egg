package guia7;

import java.util.Scanner;

public class ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
        int counterInc = 0;
        String cadena;
        
        do {
            
            System.out.println("Ingrese una cadena:");
            cadena = input.nextLine();
            
            int len = cadena.length();
            
            if ((cadena.length() >= 2 && cadena.length() <= 5) && (cadena.substring(0,1).equals("X") && cadena.substring(len-1, len).equals("O"))) {
                counter++;
                System.out.println("Cadena correcta");
            } else if (cadena.equals("&&&&&")) {
                counter++;
                System.out.println("Cadena final");
            } else {
                counterInc++;
                System.out.println("Cadena incorrecta");
            }
            
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("La cantidad de cadenas correctas fue " + counter);
        System.out.println("La cantidad de cadenas incorrectas fue " + counterInc);
        
    }
    
}
