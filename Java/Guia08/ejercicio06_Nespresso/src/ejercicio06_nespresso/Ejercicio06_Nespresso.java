package ejercicio06_nespresso;

import entities.Cafetera;
import java.util.Scanner;
import services.CafeteraServices;

public class Ejercicio06_Nespresso {

    public static void main(String[] args) {
        
        CafeteraServices servCafetera = new CafeteraServices();
        Cafetera cafetera = servCafetera.createCafetera();
        
        menu(cafetera);
        
    }
    
    public static void menu(Cafetera cafetera) {
        
        Scanner input = new Scanner(System.in);
        CafeteraServices servCafetera = new CafeteraServices();
        
        int choice;
        do {
            System.out.println("\nMENÚ");
            System.out.println("1) Servir una taza");
            System.out.println("2) Agregar café");
            System.out.println("3) Llenar cafetera");
            System.out.println("4) Vaciar cafetera");
            System.out.println("5) Información sobre mi cafetera");
            System.out.println("6) Salir");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    servCafetera.pourDrink(cafetera);
                    break;
                case 2:
                    servCafetera.addCoffee(cafetera);
                    break;
                case 3:
                    servCafetera.fillCafetera(cafetera);
                    break;
                case 4:
                    servCafetera.emptyCafetera(cafetera);
                    break;
                case 5:
                    System.out.println(cafetera);
                    break;
                case 6:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    break;
            }
            
        } while (choice != 6);
        
    }
    
}
