package Services;

import Entities.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class PersonaServices {
    
    Scanner input = new Scanner(System.in, "Windows-1252");
    
    public Persona crearPersona() {
 
        System.out.println("¿Cuál es su nombre?");
        String name = input.nextLine();
        
        System.out.println("¿Cuál es su fecha de nacimiento (dd/mm/aaaa)?");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        input.nextLine();
        
        LocalDate birth = LocalDate.of(year, month, day);
        
        return new Persona(name, birth);
       
    }
    
    public int calcularEdad(Persona pers) {
        
        int persAge;
        if (LocalDate.now().getDayOfYear() < pers.getBirth().getDayOfYear()) {
            persAge = LocalDate.now().getYear() - pers.getBirth().getYear() - 1;
            return persAge;
        } else {
            persAge = LocalDate.now().getYear() - pers.getBirth().getYear();
            return persAge;
        }
        
    }
    
    public boolean menorQue(Persona pers1, Persona pers2) {
        
        int agePers1 = calcularEdad(pers1);
        int agePers2 = calcularEdad(pers2);
        
        return agePers1 > agePers2;
        
    }
    
}
