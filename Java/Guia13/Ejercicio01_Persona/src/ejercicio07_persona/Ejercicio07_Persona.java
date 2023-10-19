package ejercicio07_persona;

import Entities.Persona;
import Services.PersonaService;

public class Ejercicio07_Persona {

    public static void main(String[] args) {
        
        PersonaService servPersona = new PersonaService();
        
        Persona pers1 = null;
        Persona pers2 = new Persona();

        try {
            System.out.println(servPersona.isAdult(pers1));
        } catch (NullPointerException e) {
            System.out.println("Error: la edad es nula.");
        }

        try {
            System.out.println(servPersona.isAdult(pers2));
        } catch (NullPointerException e) {
            System.out.println("Error: la edad es nula.");
        }

    }
    
}
