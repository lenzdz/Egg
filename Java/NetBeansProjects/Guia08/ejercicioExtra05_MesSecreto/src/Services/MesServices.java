package Services;

import Entities.Mes;
import java.util.Random;
import java.util.Scanner;

public class MesServices {
    
    public Mes crearMesesAnio() {
        
        Mes meses = new Mes();
        String[] arregloMeses = new String[12];
        
        arregloMeses[0] = "enero";
        arregloMeses[1] = "febrero";
        arregloMeses[2] = "marzo";
        arregloMeses[3] = "abril";
        arregloMeses[4] = "mayo";
        arregloMeses[5] = "junio";
        arregloMeses[6] = "julio";
        arregloMeses[7] = "agosto";
        arregloMeses[8] = "septiembre";
        arregloMeses[9] = "octubre";
        arregloMeses[10] = "noviembre";
        arregloMeses[11] = "diciembre";
        
        meses.setMeses(arregloMeses);
        
        return meses;
        
    }
    
    public String crearMesSecreto(Mes meses) {
        
        Random random = new Random();
        
        int randomInt = random.nextInt(12);
        String mesSecreto = meses.getMeses()[randomInt];
        
        System.out.println("[El mes secreto es " + mesSecreto + "]");
        
        return mesSecreto;
        
    }
    
    public void adivinarMes(String mesSecreto) {
        
        Scanner input = new Scanner(System.in);
        
        int contador = 3;
        String adivinanza;
        do {
            
            System.out.println("¡Adivina el mes secreto! Te quedan " + contador + " intentos.");
            adivinanza = input.nextLine();
            contador--;
            
            if (adivinanza.equalsIgnoreCase(mesSecreto)) {
                System.out.println("¡Felicidades! Has adivinado.");
            } else if (contador > 0) {
                System.out.println("¡Ups! Ese no es.");
            } else {
                System.out.println("No adivinaste :(");
            }
            
        } while (!adivinanza.equalsIgnoreCase(mesSecreto) && contador > 0);
        
    }
    
}
