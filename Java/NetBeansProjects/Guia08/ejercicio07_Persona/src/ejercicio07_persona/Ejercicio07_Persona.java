package ejercicio07_persona;

import Entities.Persona;
import Services.PersonaService;

public class Ejercicio07_Persona {

    public static void main(String[] args) {
        
        PersonaService servPersona = new PersonaService();
        
        Persona pers1 = servPersona.createPersona();
        Persona pers2 = servPersona.createPersona();
        Persona pers3 = servPersona.createPersona();
        Persona pers4 = servPersona.createPersona();
        
        // System.out.println(pers1);
        //System.out.println(pers2);
        //System.out.println(pers3);
        //System.out.println(pers4);
        
        int imcsStatuses[] = new int[4];
        imcsStatuses[0] = servPersona.imcStatus(pers1);
        imcsStatuses[1] = servPersona.imcStatus(pers2);
        imcsStatuses[2] = servPersona.imcStatus(pers3);
        imcsStatuses[3] = servPersona.imcStatus(pers4);
        
        boolean adultStatuses[] = new boolean[4];
        adultStatuses[0] = servPersona.isAdult(pers1);
        adultStatuses[1] = servPersona.isAdult(pers2);
        adultStatuses[2] = servPersona.isAdult(pers3);
        adultStatuses[3] = servPersona.isAdult(pers4);

        percentageImc(imcsStatuses);
        percentageAdult(adultStatuses);
        
    }
    
    public static void percentageImc(int[] imcsStatuses) {
        
        int below = 0;
        int normal = 0;
        int above = 0;
        for (int i = 0; i < 4; i++) {
            switch (imcsStatuses[i]) {
                case -1:
                    below += 1;
                    break;
                case 0:
                    normal += 1;
                    break;
                case 1:
                    above += 1;
                    break;
            }
        }
        
        System.out.println(((below*100)/4) + " % de personas están por debajo de su peso ideal.");
        System.out.println(((normal*100)/4) + " % de personas están en su peso ideal.");
        System.out.println(((above*100)/4) + " % de personas están por encima de su peso ideal.");
        
    }
    
    public static void percentageAdult(boolean[] adultStatuses) {
        
        int isAdult = 0;
        int notAdult = 0;
        for (int i = 0; i < 4; i++) {
            if (adultStatuses[i] == true) {
                isAdult += 1;
            } else {
                notAdult += 1;
            }
        }
        
        System.out.println(((isAdult*100)/4) + " % de personas son mayores de edad.");
        System.out.println(((notAdult*100)/4) + " % de personas no son mayores de edad.");
        
    }
    
}
