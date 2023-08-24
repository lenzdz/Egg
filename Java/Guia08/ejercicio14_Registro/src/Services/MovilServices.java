package Services;

import Entities.Movil;
import java.util.Scanner;

public class MovilServices {
    
    Scanner input = new Scanner(System.in, "Windows-1252");
    
    public Movil cargarCelular() {
        
        System.out.println("Ingrese la marca del celular:");
        String marca = input.nextLine();
        
        System.out.println("Ingrese el modelo del celular:");
        String modelo = input.nextLine();
        
        int precio;
        do {
            
            System.out.println("Ingrese el precio del celular:");
            precio = input.nextInt();
            
            if (precio < 0) {
                System.out.println("El precio no puede ser menor que cero.");
            }
            
        } while (precio < 0);
        
        System.out.println("Ingrese la memoria Ram del celular:");
        int memoriaRam = input.nextInt();
        
        System.out.println("Ingrese la capacidad de almacenamiento del celular:");
        int almacenamiento = input.nextInt();
        
        int codigo[] = ingresarCodigo();
        
        return new Movil(marca, modelo, precio, memoriaRam, almacenamiento, codigo);
        
    }
    
    public int[] ingresarCodigo() {
    
        int[] codigo = new int[7];
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el dígito #" + (i+1) + " del código:");
            codigo[i] = input.nextInt();
        }
        
        return codigo;
    }
    
}
