package ejercicio08_cadena;

import Entities.Cadena;
import Services.CadenaServices;
import java.util.Scanner;

public class Ejercicio08_Cadena {

    public static void main(String[] args) {
        
        CadenaServices servCadena = new CadenaServices();
        
        Cadena cad1 = new Cadena();
        servCadena.llenarCadena(cad1);
        
        menu(cad1);
        
    }
    
    public static void menu(Cadena cad1) {
        
        CadenaServices servCadena = new CadenaServices();
        Scanner input = new Scanner(System.in, "Windows-1252");
        
        int choice;
        do {
            
            System.out.println("\nMENÚ");
            System.out.println("1) Contar vocales");
            System.out.println("2) Verificar presencia de caracter");
            System.out.println("3) Contar incidencias de caracter");
            System.out.println("4) Invertir frase");
            System.out.println("5) Comparar longitud con otra oración");
            System.out.println("6) Concatenar con otra oración");
            System.out.println("7) Reemplazar caracter");
            System.out.println("8) Salir");
            choice = input.nextInt();
            
            switch (choice) {
                
                case 1:
                    servCadena.contarVocales(cad1);
                    break;
                case 2:
                    servCadena.verificarCaracter(cad1);
                    break;
                case 3:
                    servCadena.incidenciasCaracter(cad1);
                    break;
                case 4:
                    servCadena.invertirOracion(cad1);
                    break;
                case 5:
                    servCadena.compararLongitud(cad1);
                    break;
                case 6:
                    servCadena.concatenarOraciones(cad1);
                    break;
                case 7:
                    servCadena.reemplezarCaracter(cad1);
                    break;
                case 8:
                    continue;
                default:
                    System.out.println("Opción inválida. Vuévalo a intentar.");
                    break;
            }
            
        } while (choice != 8);
        
    }
    
}
