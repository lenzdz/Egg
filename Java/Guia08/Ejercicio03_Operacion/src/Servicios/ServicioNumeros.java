package Servicios;

import Entidades.Numeros;
import java.util.Scanner;

public class ServicioNumeros {
    
    private final Scanner input = new Scanner(System.in);
    
    public Numeros crearOperacion() {
        
        System.out.println("Ingrese el primer número:");
        int num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = input.nextInt();
        
        return new Numeros(num1, num2);
    }
    
    public int sumar(Numeros numbers) {
        
        int x = numbers.getNum1() + numbers.getNum2();
        
        return x;
    }
    
    public int restar(Numeros numbers) {
        
        int x = numbers.getNum1() - numbers.getNum2();
        
        return x;
        
    }
    
    public int multiplicar(Numeros numbers) {
        
        int x = 0;
        if (numbers.getNum1() == 0 || numbers.getNum2() == 0) {
            System.out.println("¡Ups! Uno de tus números es cero.");
            return x;
        } else {
            x = numbers.getNum1() * numbers.getNum2();
            return x;
        }
 
    }
    
    public double dividir(Numeros numbers) {
        
        double x = 0;
        if (numbers.getNum1() == 0 || numbers.getNum2() == 0) {
            System.out.println("¡Ups! Uno de tus números es cero.");
            return x;
        } else {
            x = (double) numbers.getNum1() / numbers.getNum2();
            return x;
        }
        
    }
    
}
