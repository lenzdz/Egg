package services;

import java.util.HashMap;
import java.util.Scanner;

import entities.Country;

public class CountryServices {

    Scanner input = new Scanner(System.in);
    
    public HashMap<Integer, Country> createCities() {

        HashMap<Integer, Country> cityPostalCode = new HashMap<>();

        cityPostalCode.put(35116829, new Country("Irlanda", "Gaillimh"));
        cityPostalCode.put(441007, new Country("Colombia", "Manaure"));
        cityPostalCode.put(8112317, new Country("Japón", "Kasuya-machi"));
        cityPostalCode.put(2669, new Country("Noruega", "Bjorli"));
        cityPostalCode.put(80502, new Country("Kenia", "Bargoni"));
        cityPostalCode.put(14000, new Country("Laos", "Abiak"));
        cityPostalCode.put(35230, new Country("Francia", "Noyal-Châtillon-sur-Seiche"));
        cityPostalCode.put(799260, new Country("India", "Jalabazar"));
        cityPostalCode.put(7903, new Country("Bangladesh", "Habiganj"));
        cityPostalCode.put(28910620, new Country("Brasil", "Vila do Sol"));
        
        return cityPostalCode;
    }

    public Integer submitPostalCode(String process) {
        System.out.println("Ingrese el código postal a " + process + ":");
        Integer postalCode = input.nextInt();
        input.nextLine();
        return postalCode;
    }

    public void checkCities(HashMap<Integer, Country> cityPostalCodes) {

        Integer postalCode = submitPostalCode("buscar");

        if (cityPostalCodes.containsKey(postalCode)) {
            System.out.println("El código " + postalCode + " corresponde a " + cityPostalCodes.get(postalCode).getZone() + ", " + cityPostalCodes.get(postalCode).getName() + ".");
        } else {
            System.out.println("No se encontró el código postal en el sistema.");
        }

    }

    public HashMap<Integer, Country> addCity(HashMap<Integer, Country> cityPostalCodes) {

        Integer postalCode = submitPostalCode("añadir");

        System.out.println("Escriba el nombre del país asociado al código postal:");
        String name = input.nextLine();

        System.out.println("Escriba el nombre de la ciudad asociada al código postal:");
        String zone = input.nextLine();

        cityPostalCodes.putIfAbsent(postalCode, new Country(name, zone));

        return cityPostalCodes;
    }

    public HashMap<Integer, Country> removeCity(HashMap<Integer, Country> cityPostalCodes) {

        Integer condition = 0;
        do {
            Integer postalCode = submitPostalCode("eliminar");
            cityPostalCodes.remove(postalCode);
            condition++;
        } while (condition < 3);
        
        return cityPostalCodes;
    }
}
