package Main;

import java.util.Scanner;

public class DivisonApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer x = null;
        Integer y = null;

        Boolean dividendo;
        do {
            try {
                System.out.println("Ingrese el dividendo:");
                x = Integer.parseInt(input.nextLine());
                dividendo = false;
            } catch (NumberFormatException e) {
                System.out.println("Error: el texto ingresado no corresponde a un número entero.");
                dividendo = true;
            }
        } while(dividendo);

        Boolean divisor;
        do {
            try {
                System.out.println("Ingrese el divisor:");
                y = Integer.parseInt(input.nextLine());
                divisor = false;
            } catch (NumberFormatException e) {
                System.out.println("Error: el texto ingresado no corresponde a un número entero.");
                divisor = true;
            }
        } while(divisor);

        Integer ans;
        try {
            ans = x/y;
            System.out.println("La divisón entre ambos números da como resultado " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Error: no es posible dividir por cero.");
        }

    }

}
