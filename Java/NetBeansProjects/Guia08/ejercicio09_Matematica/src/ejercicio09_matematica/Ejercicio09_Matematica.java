package ejercicio09_matematica;

import Entities.Matematica;
import Services.MatematicaServices;

public class Ejercicio09_Matematica {

    public static void main(String[] args) {
        
        MatematicaServices matServices = new MatematicaServices();
        Matematica numbers = new Matematica();
        matServices.llenarMatematica(numbers);
        
        System.out.println(numbers);
        
        System.out.println("El número más grande es: " + matServices.devolverMayor(numbers));
        System.out.println("La potencia del número mayor elevado al número menor es: " + matServices.calcularPotencia(numbers));
        System.out.println("La raíz cuadrada del menor de los números es: " + matServices.calcularRaiz(numbers));
        
    }
    
}
