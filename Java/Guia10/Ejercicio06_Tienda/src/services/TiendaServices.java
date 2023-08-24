package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServices {
    
    Scanner input = new Scanner(System.in);
    HashMap<String, Integer> productos = new HashMap();
    
    public void menu() {
        
        int choice;
        do {
            
            System.out.println("--------- MENÚ ---------");
            System.out.println("1) Agregar producto");
            System.out.println("2) Actualizar precio de producto");
            System.out.println("3) Eliminar producto");
            System.out.println("4) Ver todos los productos");
            System.out.println("5) Salir");
            choice = input.nextInt();
            input.nextLine();
            
            if (choice >= 2 && choice <= 4 && productos.isEmpty()) {
                System.out.println("Aún no se han añadido productos.");
            } else {
                
                switch (choice) {
                case 1:
                    anadirProducto();
                    break;
                case 2:
                    actualizarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    verProductos();
                    break;
                case 5:
                    continue;
                default:
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                }
                
            }
            
            
            
        } while (choice != 5);
        
    }
    
    public void anadirProducto() {
        
        System.out.println("Ingrese el nombre del producto:");
        String nombre = input.nextLine().toUpperCase();
        
        System.out.println("Ingrese el precio del producto:");
        Integer precio = input.nextInt();
        input.nextLine();
        
        productos.put(nombre, precio);
        
    }
    
    public void actualizarPrecio() {
        
        System.out.println("Ingrese el nombre del producto a actualizar:");
        String nombre = input.nextLine().toUpperCase();
        
        if (productos.containsKey(nombre)) {
            
            System.out.println("Ingrese el nuevo precio del producto:");
            Integer precio = input.nextInt();
            input.nextLine();
            productos.replace(nombre, precio);
            
        } else {
            System.out.println("El producto no existe.");
        }
        
    }
    
    public void eliminarProducto() {
        
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String nombre = input.nextLine().toUpperCase();
        
        if (productos.containsKey(nombre)) {
            
            productos.remove(nombre);
            System.out.println("Producto eliminado exitosamente.");
            
        } else {
            System.out.println("El producto no existe.");
        }
        
    }
    
    public void verProductos() {
        
        for (Map.Entry<String, Integer> aux : productos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            
            System.out.println("Producto: " + key + " | Precio: " + value);
        }
        
    }
    
}
