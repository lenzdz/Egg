package guia7_extras;

import java.util.Scanner;

public class ejercicioExtra06 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas medidas:");
        int people = input.nextInt();
        
        int height;
        int sum = 0;
        int counterUnder160 = 0;
        int sumUnder160 = 0;
        for (int i = 1; i <= people; i++) {
            
            System.out.println("Ingrese la altura en cm de la persona #" + i);
            height = input.nextInt();
            
            sum = sum + height;
            
            if (height < 160) {
                sumUnder160 = sumUnder160 + height;
                counterUnder160++;
            }
        }
        
        System.out.println("El promedio de estaturas global es de " + ((double)sum/people));
        if (counterUnder160 > 0) {
            System.out.println("El promedio de las estaturas por debajo de 160 " + ((double)sumUnder160/counterUnder160));
        } else {
            System.out.println("No hubo personas que midieran menos de 160");
        }
        
        
    }
    
}