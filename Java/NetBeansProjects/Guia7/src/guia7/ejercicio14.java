package guia7;

import java.util.Scanner;

public class ejercicio14 {
    
    public static void main(String[] args) {
        
        menu();
        
    }
    
    public static void menu() {
        
        Scanner input = new Scanner(System.in);
        int choice;
        
        System.out.println("Ingrese una cantidad de euros:");
        double eur = input.nextDouble();
        
        do {
            
            System.out.println("Escoja una opción:");
            System.out.println("1) Convertir " + eur + " € a dólares.");
            System.out.println("2) Convertir " + eur + " € a yenes.");
            System.out.println("3) Convertir " + eur + " € a libras.");
            System.out.println("4) Cambiar monto de euros");
            System.out.println("5) Salir");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println(eur + " € equivalen a $" + eur*1.28611);
                    break;
                case 2:
                    System.out.println(eur + " € equivalen a ¥" + eur*129.852);
                    break;
                case 3:
                    System.out.println(eur + " € equivalen a £" + eur*0.86);
                    break;
                case 4:
                    System.out.println("Ingrese una nueva cantidad de euros:");
                    eur = input.nextDouble();
                    break;
                case 5:
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción inválida. Vuélva a intentarlo.");
            }
            
        } while (choice != 5);
        
    }
    
}