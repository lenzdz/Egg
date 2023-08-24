package exercise02_tempconverter;

import tempconverter.entities.Temperature;
import tempconverter.services.TempConverterServices;

public class Exercise02_TempConverter {

    public static void main(String[] args) {
      
        TempConverterServices servTempConvert = new TempConverterServices();
        Temperature tempInfo = servTempConvert.createTemp();
        
        String newUnit = servTempConvert.defineUnit();
        
        double tempConverted = servTempConvert.convertTemp(tempInfo, newUnit);
        
        servTempConvert.printResult(tempInfo, newUnit, tempConverted);
        
        
    }
    
}
