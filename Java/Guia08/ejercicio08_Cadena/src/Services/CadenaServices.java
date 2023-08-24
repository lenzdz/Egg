package Services;

import Entities.Cadena;
import java.util.Scanner;

public class CadenaServices {
    
    Scanner input = new Scanner(System.in, "Windows-1252");
    
    public void llenarCadena(Cadena cad) {
        
        String userInput;
        do {
            System.out.println("Ingrese la oración para analizar (mínimo 2 caracteres):");
            userInput = input.nextLine();
        } while (userInput.length() < 2);
        
        cad.setCad(userInput);
        cad.setLength(userInput.length());
        
    }
    
    public void contarVocales(Cadena cad) {
        
        int contador = 0;
        for (int i = 0; i < cad.getLength(); i++) {

            if (cad.getCad().substring(i, i+1).equalsIgnoreCase("a") ||
                cad.getCad().substring(i, i+1).equalsIgnoreCase("e") ||
                cad.getCad().substring(i, i+1).equalsIgnoreCase("i") ||
                cad.getCad().substring(i, i+1).equalsIgnoreCase("o") ||
                cad.getCad().substring(i, i+1).equalsIgnoreCase("u")) {
                contador++;
            }
        }
        
        System.out.println("Tu oración tiene " + contador + " vocales.");
        
    }
    
    public void verificarCaracter(Cadena cad) {
        
        String character;
        do {
            
            System.out.println("¿Qué caracter desea buscar?");
            character = input.nextLine();
            
            if (character.length() > 1) {
                System.out.println("Solo es posible buscar un caracter.");
            }
            
        } while (character.length() > 1);
        
        boolean contieneCaracter = cad.getCad().contains(character);

        if (contieneCaracter) {
            System.out.println("El caracter \"" + character + "\" sí está presente en la cadena.");
        } else {
            System.out.println("El caracter \"" + character + "\" sí está presente en la cadena.");
        }
        
    }
    
    public void incidenciasCaracter(Cadena cad) {
        
        String character;
        do {

            System.out.println("¿Qué caracter desea contar?");
            character = input.nextLine().toLowerCase();

            if (character.length() > 1) {
                System.out.println("Solo es posible buscar un caracter.");
            }

        } while (character.length() > 1);
        
        boolean contieneCaracter = cad.getCad().contains(character);
        
        if (contieneCaracter) {
            
            int contador = 0;
            for (int i = 0; i < cad.getLength(); i++) {

                if (cad.getCad().substring(i, i + 1).equalsIgnoreCase(character)) {
                    contador++;
                }
            }
            
            System.out.println("El caracter \"" + character + "\" aparece " + contador + " veces en la cadena.");
        } else {
            System.out.println("El caracter \"" + character + "\" no está presente en la cadena.");
        }
        
    }
    
    public void invertirOracion(Cadena cad) {
        
        String reverseCad = "";
        for (int i = cad.getLength()-1; i >= 0; i--) {
            reverseCad += cad.getCad().substring(i,i+1);
        }
        
        System.out.println("La oración invertida es: " + reverseCad);
    }
    
    public void compararLongitud(Cadena cad) {
        
        String userInput;
        do {
            System.out.println("Ingrese la oración a comparar (mínimo 2 caracteres):");
            userInput = input.nextLine();
        } while (userInput.length() < 2);
        
        boolean mismaLongitud = cad.getLength() == userInput.length();
        
        if (mismaLongitud) {
            System.out.println("Las oraciones tienen la misma longitud.");
        } else {
            System.out.println("Las oraciones tienen una longitud diferente.");
        }
        
    }
    
    public void concatenarOraciones(Cadena cad) {
        
        String userInput;
        do {
            System.out.println("Ingrese la oración a concatenar (mínimo 1 caracter):");
            userInput = input.nextLine();
        } while (userInput.length() < 1);
        
        System.out.println("El resultado de la concatenación es: " + cad.getCad().concat(" ").concat(userInput));
        
    }
    
    public void reemplezarCaracter(Cadena cad) {
        
        String character;
        do {

            System.out.println("¿Qué caracter desea reemplazar?");
            character = input.nextLine().toLowerCase();

            if (character.length() > 1) {
                System.out.println("Solo es posible reemplazar un caracter.");
            }

        } while (character.length() > 1);
        
        boolean contieneCaracter = cad.getCad().contains(character);
        
        if (contieneCaracter) {
            String newCharacter;
            do {

                System.out.println("¿Por qué caracter desea reemplazarlo?");
                newCharacter = input.nextLine().toLowerCase();

                if (newCharacter.length() > 1) {
                    System.out.println("Solo es posible escoger un caracter.");
                }

            } while (newCharacter.length() > 1);

            System.out.println("La cadena con el caracter reemplazado es: " + cad.getCad().replace(character, newCharacter));
        } else {
            System.out.println("La oración no tiene el caracter.");
        }
        
        
        
    }
    
}
