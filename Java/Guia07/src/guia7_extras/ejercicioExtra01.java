package guia7_Extras;

import java.util.Scanner;

public class ejercicioExtra01 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el tiempo a convertir en minutos:");
        int min = input.nextInt();
        
        minConvert(min);
        
    }
    
    public static void minConvert(int min) {
        
        int hours = min / 60;
        int days = hours / 24;
        int remainderMins = min % 60;
        
        if (days != 0) {
            hours = hours - (days*24);
        }
        
        if (days == 0) { // No ha pasado un día
            System.out.println(min + " minuto(s) equivalen a " + hours + " hora(s) con " + remainderMins + " minuto(s).");
        } else {
            System.out.println(min + " minuto(s) equivalen a " + days + " día(s), " + hours + " hora(s) con " + remainderMins + " minuto(s).");
        }
        
    }
    
}