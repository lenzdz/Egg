package Services;

import Entities.Matematica;

public class MatematicaServices {
    
    public void llenarMatematica(Matematica numbers) {
        
        // Se genera un número aleatorio entre 1 y 10.
        numbers.setNum1(1 + Math.random()*10);
        numbers.setNum2(1 + Math.random()*10);
        
    }
    
    public double devolverMayor(Matematica numbers) {
        
        if (numbers.getNum1() >= numbers.getNum2()) {
            return numbers.getNum1();
        }  else {
            return numbers.getNum2();
        }
        
    }
    
    public double calcularPotencia(Matematica numbers) {
        
        if (Math.round(numbers.getNum1()) >= Math.round(numbers.getNum2())) {
            return Math.pow(numbers.getNum1(),numbers.getNum2());
        }  else {
            return Math.pow(numbers.getNum2(),numbers.getNum1());
        }
        
    }
    
    public double calcularRaiz(Matematica numbers) {
        
        if (numbers.getNum1() <= numbers.getNum2()) {
            return Math.sqrt(numbers.getNum1());
        } else {
            return Math.sqrt(numbers.getNum2());
        }
        
    }
    
}
