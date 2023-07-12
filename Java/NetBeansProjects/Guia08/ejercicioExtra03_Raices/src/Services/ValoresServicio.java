package Services;

import Entities.Valores;
import java.util.Scanner;

public class ValoresServicio {
    
    Scanner input = new Scanner(System.in);
    
    public Valores asignarValores() {
        
        Valores val = new Valores();
        
        System.out.println("Ingrese el valor de A:");
        val.setA(input.nextDouble());
        
        System.out.println("Ingrese el valor de B:");
        val.setB(input.nextDouble());
        
        System.out.println("Ingrese el valor de C:");
        val.setC(input.nextDouble());
        
        return val;
    }
    
    public double getDiscriminante(Valores val) {

        return (Math.pow(val.getB(),2) - (4 * val.getA() * val.getC()));
        
    }
    
    public boolean tieneRaices(Valores val) {
        
        return getDiscriminante(val) > 0;
        
    }
    
    public boolean tieneRaiz(Valores val) {

        return getDiscriminante(val) == 0;
        
    }
    
    public void obtenerRaices(Valores val) {
        
        double res1 = ((-(val.getB()) + (Math.pow(val.getB(),2) - (4 * val.getA() * val.getC()))) / (2 * val.getA()));
        double res2 = ((-(val.getB()) - (Math.pow(val.getB(),2) - (4 * val.getA() * val.getC()))) / (2 * val.getA()));
        
        System.out.println("Las soluciones de la ecuación son " + res1 + " y " + res2 + ".");
        
    }
    
    public void obtenerRaiz(Valores val) {
        
        double res = ((-(val.getB()) + (Math.pow(val.getB(),2) - (4 * val.getA() * val.getC()))) / (2 * val.getA()));
        
        System.out.println("La solución de la ecuación es " + res + ".");        
    }
    
    public void calcular(Valores val) {
        
        boolean tieneRaices = tieneRaices(val);
        boolean tieneRaiz = tieneRaiz(val);
        
        if (tieneRaiz) { // La ecuación tiene una única solución.
            obtenerRaiz(val);
        } else if (tieneRaices) { // La ecuación tiene dos soluciones reales.
            obtenerRaices(val);
        } else {
            System.out.println("La ecuación tiene dos soluciones complejas. Este programa no soporta soluciones complejas.");
        }
        
    }
    
}
