package ejercicio03_operacion;

import Entidades.Numeros;
import Servicios.ServicioNumeros;

public class Ejercicio03_Operacion {

    public static void main(String[] args) {
        
        ServicioNumeros servNum = new ServicioNumeros();
        
        // Se instancia el objeto
        Numeros numbers = servNum.crearOperacion();
        
        int suma = servNum.sumar(numbers);
        System.out.println("La suma de los dos números es: " + suma);
        
        int resta = servNum.restar(numbers);
        System.out.println("La resta de los dos números es: " + resta);
        
        int multiplicacion = servNum.multiplicar(numbers);
        System.out.println("La multiplicación de los dos números es: " + multiplicacion);
        
        double division = servNum.dividir(numbers);
        System.out.println("La división de los dos números es: " + division);
    }
    
}
