package numbersApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        Integer num;
        do {            
            System.out.println("Escribe un número para añadirlo a la lista. Ingresar -99 te sacará del programa.");
            num = input.nextInt();

            if (num != -99) {
                numberList.add(num);
            }
        } while (num != -99);

        Integer suma = 0;
        for (Integer aux : numberList) {
            suma += aux;
        }

        System.out.println("El total de números ingresados fue: " + numberList.size());
        System.out.println("La suma de todos los números es: " + suma);
        System.out.println("La media de todos los números es: " + suma/numberList.size());

        input.close();
        
    }
}
