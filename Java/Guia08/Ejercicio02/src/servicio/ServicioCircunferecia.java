package servicio;

import entidad.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferecia {
    
    Scanner input = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese el radio de su círculo:");
        Circunferencia rad1 = new Circunferencia(input.nextDouble());
        
        return rad1;
    }
    
    public void area(Circunferencia rad) {
        
        double area = Math.PI * (Math.pow(rad.getRad(),2));
        
        System.out.println("El área del círculo es: " + area);
        
    }
    
    public void perimetro(Circunferencia rad) {
        double perim = 2 * Math.PI * rad.getRad();
        
        System.out.println("El perímetro del círculo es: " + perim);
    }
    
}
