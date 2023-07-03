package Services;

import Entities.Vehiculo;
import java.util.Scanner;

public class VehiculoServices {
    
    Scanner input = new Scanner(System.in);
    
    public Vehiculo crearVehiculo() {
        
        System.out.println("Indique la marca del vehículo:");
        String marca = input.nextLine();
        
        System.out.println("Indique el modelo del vehículo:");
        String modelo = input.nextLine();
        
        String tipo;
        do {
            System.out.println("Indique el tipo del vehículo (carro, moto, bici):");
            tipo = input.nextLine();
            
            if (!tipo.equalsIgnoreCase("moto") && !tipo.equalsIgnoreCase("carro") && !tipo.equalsIgnoreCase("bici")) {
                System.out.println("Opción inválida. Vuelva a intentarlo.");
            }
        } while (!tipo.equalsIgnoreCase("moto") && !tipo.equalsIgnoreCase("carro") && !tipo.equalsIgnoreCase("bici"));
        
        System.out.println("Indique el año del vehículo:");
        int anio = input.nextInt();
        input.nextLine();
        
        return new Vehiculo(marca, modelo, tipo, anio);
        
    }
    
    public int moverse(Vehiculo automotor, int sec) {
        
        if (automotor.getTipo().equalsIgnoreCase("carro")) {
            return sec * 3;
        } else if (automotor.getTipo().equalsIgnoreCase("moto")) {
            return sec * 2;
        } else {
            return sec;
        }
        
    }
    
    public int frenar(Vehiculo automotor) {
        
        if (automotor.getTipo().equalsIgnoreCase("carro") || automotor.getTipo().equalsIgnoreCase("moto")) {
            return 2;
        } else {
            return 0;
        }
        
    }
    
    public void movimiento(Vehiculo automotor) {
        
        System.out.println("\nINFORMACIÓN DE MOVIMIENTO SOBRE " + automotor.getMarca().toUpperCase() + " " + automotor.getModelo().toUpperCase());
        
        // Unidad de tiempo base: segundos.
        System.out.println("Tras 5 segundos, el vehículo se habría movido " + (moverse(automotor, 5)+frenar(automotor)) + " metro(s).");
        System.out.println("Tras 10 segundos, el vehículo se habría movido " + (moverse(automotor, 10)+frenar(automotor)) + " metro(s).");
        System.out.println("Tras 1 minuto, el vehículo se habría movido " + (moverse(automotor, 60)+frenar(automotor)) + " metro(s).");
        
    }
    
    public void movimientoCincoMin(Vehiculo automotor1, Vehiculo automotor2, Vehiculo automotor3) {
        
        System.out.println("\n¿QUÉ VEHÍCULO HABRÁ AVANZADO MÁS LUEGO DE 5 MINUTOS?");
        
        int distanciaAutomotor1 = moverse(automotor1, 300) + frenar(automotor1);
        int distanciaAutomotor2 = moverse(automotor2, 300) + frenar(automotor2);
        int distanciaAutomotor3 = moverse(automotor3, 300) + frenar(automotor3);
        
        if (distanciaAutomotor1 >= distanciaAutomotor2 && distanciaAutomotor1 >= distanciaAutomotor3) {
            System.out.println("El vehículo " + automotor1.getMarca() + " " + automotor1.getModelo() + " sería el que más avanzaría, logrando " + distanciaAutomotor1 + " metros luego de frenar tras 5 minutos de movimiento.");
        } else if (distanciaAutomotor2 > distanciaAutomotor1 && distanciaAutomotor2 > distanciaAutomotor3) {
            System.out.println("El vehículo " + automotor2.getMarca() + " " + automotor2.getModelo() + " sería el que más avanzaría, logrando " + distanciaAutomotor2 + " metros luego de frenar tras 5 minutos de movimiento.");
        } else {
            System.out.println("El vehículo " + automotor3.getMarca() + " " + automotor3.getModelo() + " sería el que más avanzaría, logrando " + distanciaAutomotor1 + " metros luego de frenar tras 5 minutos de movimiento.");
        }
        
    }
}
