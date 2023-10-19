package Services;

import Entities.Persona;
import java.util.Scanner;

public class PersonaService {
    
    Scanner input = new Scanner(System.in, "Windows-1252");
    
    public Persona createPersona() {
        
        System.out.println("Ingrese el nombre de la persona:");
        String name = input.nextLine();
        
        int age;
        do {
            
            System.out.println("Ingrese la edad de la persona:");
            age = input.nextInt();
            input.nextLine();
            
            if (age < 0) {
                System.out.println("La edad debe ser superior a 0.");
            }
            
        } while (age < 0);
        
        char sex;
        do {
            
            System.out.println("Ingrese el sexo de la persona (M, H, O):");
            sex = input.next().toLowerCase().charAt(0);
            
            if ((sex != 'm')&&(sex != 'h')&&(sex != 'o')) {
                System.out.println("Opción inválida. Vuelva a intentarlo.");
            }
            
        } while ((sex != 'm')&&(sex != 'h')&&(sex != 'o'));
        
        double weight;
        do {
            
            System.out.println("Ingrese el peso de la persona:");
            weight = input.nextDouble();
            
            if (weight < 0) {
                System.out.println("El peso debe ser superior a 0.");
            }
            
        } while (weight < 0);
        
        double height;
        do {
            
            System.out.println("Ingrese la altura de la persona:");
            height = input.nextDouble();
            input.nextLine();
            
            if (height < 0) {
                System.out.println("La altura debe ser superior a 0.");
            }
            
        } while (height < 0);
        
        return new Persona(name, age, sex, weight, height);
        
    }
    
    public int imcStatus(Persona pers) {
        
        double imc = (pers.getWeight()/(Math.pow(pers.getHeight(),2)));
        
        int x;
        if (imc < 20) {
            x = -1;
        } else if (imc >= 20 && imc <= 25) {
            x = 0;
        } else {
            x = 1;
        }
        
        return x;
    }
    
    public boolean isAdult(Persona pers) throws NullPointerException {

        boolean x = pers.getAge() >= 18;
        return x;

    }
    
}
