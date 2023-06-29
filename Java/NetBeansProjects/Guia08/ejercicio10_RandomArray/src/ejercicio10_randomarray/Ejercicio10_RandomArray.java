/**
 * Dejé este ejercicio con enteros en vez de reales porque me estresaba ver la cantidad de decimales y no encontré una forma sencilla de limitarlos
 */

package ejercicio10_randomarray;

import Entities.RandomArray;
import Services.RandomArrayServices;

public class Ejercicio10_RandomArray {

    public static void main(String[] args) {
        
        RandomArrayServices arrayServices = new RandomArrayServices();
        RandomArray arrays = new RandomArray();
        arrayServices.fillRandomArray(arrays);
        
        arrayServices.orderArray(arrays);
        
        arrayServices.fillSecondArray(arrays);
    }
    
}
