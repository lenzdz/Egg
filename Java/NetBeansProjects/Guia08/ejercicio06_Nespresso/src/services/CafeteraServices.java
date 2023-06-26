package services;

import entities.Cafetera;
import java.util.Scanner;

public class CafeteraServices {
    
    private final Scanner input = new Scanner(System.in);
    
    public Cafetera createCafetera() {
        
        System.out.println("¡Bienvenido a nuestro servicio! Primero, creemos tu cafetera.");
        
        System.out.println("¿Cuál es la capacidad máxima de tu cafetera (mL)?");
        double maxCapacity = input.nextDouble();
        input.nextLine();
        
        String theresCoffee;
        double currentQuantity = 0;
        do {
            System.out.println("¿Actualmente tu cafetera tiene café? (s/n)");
            theresCoffee = input.nextLine().toLowerCase();
            switch (theresCoffee) {
                case "s":
                    System.out.println("¿Cuánto café hay en su cafetera?");
                    currentQuantity = input.nextDouble();
                    break;
                case "n":
                    continue;
                default:
                    System.out.println("Opción inválida. Por favor, inténtelo de nuevo.");
                    break;
            }
        } while ((!theresCoffee.equals("s"))&&(!theresCoffee.equals("n")));
        
        return new Cafetera(currentQuantity, maxCapacity);
        
    }
    
    public void pourDrink(Cafetera cafetera) {
        
        if (cafetera.getCurrentQuantity() == 0) {
            
            System.out.println("La cafetera está vacía.");
            
        } else {
            
            double coffeeQuantity;
            do {

                System.out.println("¿Cuánto café servirá (mL)?");
                coffeeQuantity = input.nextDouble();

                if (coffeeQuantity >= 0) {
                    if (coffeeQuantity > cafetera.getCurrentQuantity()) {
                        System.out.println("El café no es suficiente para servir esa cantidad.");
                        System.out.println("Se ha(n) servido " + cafetera.getCurrentQuantity() + " mL y tu cafetera ha quedado vacía.");
                        cafetera.setCurrentQuantity(0);
                    } else if (coffeeQuantity == 0) {
                        System.out.println("Operación cancelada.");
                    } else {
                        cafetera.setCurrentQuantity(cafetera.getCurrentQuantity() - coffeeQuantity);
                        System.out.println("Se ha(n) servido " + coffeeQuantity + " mL y tu cafetera ha quedado con " + cafetera.getCurrentQuantity() + " mL.");
                    }
                } else {
                    System.out.println("No es posible servir menos de 0 mL. Por favor, vuelva a intentarlo.");
                }

            } while (coffeeQuantity < 0);
            
        }
    }
    
    public void addCoffee(Cafetera cafetera) {
        
        if (cafetera.getCurrentQuantity() == cafetera.getMaxCapacity()) {
            
            System.out.println("La cafetera ya está llena.");
            
        } else {
            
            double coffeeQuantity;
            do {
                System.out.println("¿Cuánto café añadirá (mL)?");
                coffeeQuantity = input.nextDouble();

                if (coffeeQuantity >= 0) {
                    if (coffeeQuantity == 0) {
                        System.out.println("Operación cancelada.");
                    } else if (coffeeQuantity + cafetera.getCurrentQuantity() <= cafetera.getMaxCapacity()) {
                        cafetera.setCurrentQuantity(cafetera.getCurrentQuantity() + coffeeQuantity);
                        System.out.println("Se ha(n) añadido " + coffeeQuantity + " mL y tu cafetera ha quedado con " + cafetera.getCurrentQuantity() + " mL.");
                    } else {
                        System.out.println("Añadir la cantidad especificada excedería la capacidad de la cafetera. Se procederá a llenarla hasta su tope máximo.");
                        fillCafetera(cafetera);
                    }
                } else {
                    System.out.println("No es posible añadir menos de 0 mL. Por favor, vuelva a intentarlo.");
                }

            } while (coffeeQuantity < 0);
            
        }
        
    }
    
    public void fillCafetera(Cafetera cafetera) {
        
        if (cafetera.getCurrentQuantity() == cafetera.getMaxCapacity()) {
            System.out.println("La cafetera ya está llena.");
        } else {
            cafetera.setCurrentQuantity(cafetera.getMaxCapacity());
            System.out.println("¡Cafetera llenada exitosamente!");
        }
    }
    
    public void emptyCafetera(Cafetera cafetera) {
        
        if (cafetera.getCurrentQuantity() == 0) {
            System.out.println("La cafetera ya está vacía.");
        } else { 
            cafetera.setCurrentQuantity(0);
            System.out.println("Cafetera vaciada exitosamente.");
        }
        
    }
    
}
