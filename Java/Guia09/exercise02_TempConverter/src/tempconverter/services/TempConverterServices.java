package tempconverter.services;

import java.util.Scanner;
import tempconverter.entities.Temperature;

public class TempConverterServices {
    
    Scanner input = new Scanner(System.in);
    
    public Temperature createTemp() {
        
        String unit = defineUnit();
        
        double temp;
        boolean flag;
        do {
            System.out.println("Ingresa la temperatura:");
            temp = input.nextDouble();
            input.nextLine();
            flag = false;
            
            if (temp < -273.15 && unit.equals("C")) {
                System.out.println("No es posible ingresar una temperatura inferior a -273.15 para grados Celsius.");
                flag = true;
            } else if (temp < -459.67 && unit.equals("F")) {
                System.out.println("No es posible ingresar una temperatura inferior a -459.67 para grados Farenheit.");
                flag = true;
            } else if (temp < 0 && unit.equals("K")) {
                System.out.println("No es posible ingresar una temperatura inferior a 0 para grados Kelvin.");
                flag = true;
            }
        } while (flag);
        
        return new Temperature(unit, temp);
    }
    
    public String defineUnit() {
        
        String unit;
        do {
            
            System.out.println("Ingresa la unidad:");
            unit = input.nextLine().toUpperCase();
            
            if (!unit.equals("K") && !unit.equals("C") && !unit.equals("F")){
                System.out.println("Unidad inválida. Vuelva a intentarlo.");
            }
            
        } while (!unit.equals("K") && !unit.equals("C") && !unit.equals("F"));
        
        return unit;
        
    }
    
    public double convertTemp(Temperature tempInfo, String newUnit) {
        
        if (tempInfo.getUnit().equals(newUnit)) {
            return tempInfo.getTemp();
        } 
        
        switch (tempInfo.getUnit()) {
            case "F":
                // De Farenheit a Celsius
                if (newUnit.equals("C")) {
                    return (tempInfo.getTemp() - 32) / 1.8;
                    
                // De Farenheit a Kelvin    
                } else {
                    return (tempInfo.getTemp()-32) * 5/9 + 273.15;
                }
            case "C":
                // De Celsius a Farenheit
                if (newUnit.equals("F")) {
                    return tempInfo.getTemp() * 1.8 + 32;
                    
                // De Celsius a Kelvin    
                } else {
                    return tempInfo.getTemp() + 273.15;
                }
           default: // Kelvin es default
                // De Kelvin a Celsius
                if (newUnit.equals("C")) {
                    return tempInfo.getTemp() - 273.15;
                    
                // De Kelvin a Farenheit
                } else {
                    return 1.8 * (tempInfo.getTemp() - 273.15) +32;
                }
        }
        
    }
    
    public void printResult(Temperature tempInfo, String newUnit, double tempConverted) {
        
        System.out.println(tempInfo.getTemp() + "°" + tempInfo.getUnit() + " equivalen a " + tempConverted + "°" + newUnit);
        
    }
    
}
