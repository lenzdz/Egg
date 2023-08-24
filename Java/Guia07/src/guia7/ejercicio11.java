package guia7;

import java.util.Scanner;

public class ejercicio11 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese dos números:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        menu(num1, num2);
        
    }
    
    public static void menu(int dato1, int dato2) {
        
        Scanner input = new Scanner(System.in);
        
        int choice, sum, subs, mult;
        double div; // Para poder dividir un número pequeño en uno
        String flag = "N";
        
        do {
            
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            choice = input.nextInt();
            input.nextLine();
            
            switch (choice) {
                case 1:
                    sum = dato1 + dato2;
                    System.out.println("La suma es " + sum);
                    break;
                case 2:
                    subs = dato1 - dato2;
                    System.out.println("La resta es " + subs);
                    break;
                case 3:
                    mult = dato1 * dato2;
                    System.out.println("La multiplicación es " + mult);
                    break;
                case 4:
                    div = (double)dato1/dato2;
                    System.out.println("La división es " + div);
                    break;
                case 5:
                    System.out.println("¿Está seguro de que desea salir? (S/N)");
                    flag = input.nextLine().toUpperCase();
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
                    break;
            }
            
        } while (!"S".equals(flag)); // Hay que colocar la comparación con equals() porque el operador != solo funciona con primitivos (como int o boolean)

    }
    
}