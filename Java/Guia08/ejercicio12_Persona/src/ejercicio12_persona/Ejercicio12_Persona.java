package ejercicio12_persona;

import Entities.Persona;
import Services.PersonaServices;
import java.util.Scanner;

public class Ejercicio12_Persona {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        PersonaServices servPersona = new PersonaServices();
        
        System.out.println("Se creará la primera persona.");
        Persona pers1 = servPersona.crearPersona();
        System.out.println("La edad de " + pers1.getName() + " es: " + servPersona.calcularEdad(pers1));
        
        System.out.println("Se creará la segunda persona.");
        Persona pers2 = servPersona.crearPersona();
        
        System.out.println("¿Es la primera persona menor que la segunda persona?");
        System.out.println(servPersona.menorQue(pers1, pers2));
        
        int choice;
        do {
            System.out.println("\nMostrar datos:");
            System.out.println("1) Persona 1");
            System.out.println("2) Persona 2");
            System.out.println("3) Salir");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(pers1);
                    break;
                case 2:
                    System.out.println(pers2);
                    break;
                case 3:
                    continue;
                default:
                    System.out.println("Opción inválida. Por favor, vuelva a intentarlo.");
                    break;
            }
            
        } while (choice != 3);
        
    }
    
}
