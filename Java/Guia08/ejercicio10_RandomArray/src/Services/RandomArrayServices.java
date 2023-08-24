package Services;

import Entities.RandomArray;
import java.util.Arrays;
import java.util.Random;

public class RandomArrayServices {
    
    public void fillRandomArray(RandomArray array) {
        
        Random randomGenerator = new Random();
        int[] randomNumbers = randomGenerator.ints(50, 0, 101).toArray();
        array.setFirstArray(randomNumbers);
        System.out.println("Primer arreglo aleatorio:");
        System.out.println(Arrays.toString(array.getFirstArray()));
        
    }
    
    public void orderArray(RandomArray array) {

        Arrays.sort(array.getFirstArray());
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(array.getFirstArray()));
        
    }
    
    public void fillSecondArray(RandomArray array) {
        
        int[] secondArray = new int[20];
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                secondArray[i] = array.getFirstArray()[i];
            } else {
                secondArray[i] = 0;
            }
        }
        array.setSecondArray(secondArray);
        
        System.out.println("Segundo arreglo:");
        System.out.println(Arrays.toString(array.getSecondArray()));
        
    }
    
}
