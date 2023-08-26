package services;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Dog;
import entities.Person;

public class PersonServices {

    Scanner input = new Scanner(System.in, "Windows-1252");
    DogServices servDog = new DogServices();
    
    ArrayList<Person> personsList = new ArrayList<>();
    
    public ArrayList<Person> createPersons() {

        personsList.add(new Person("Lena", "Paredes", 24, 1230));
        personsList.add(new Person("Nicolás", "Clavijo", 28, 1231));
        personsList.add(new Person("Mónica", "Díaz", 54, 1232));
        personsList.add(new Person("Fernando", "Salgado", 36, 1233));
        personsList.add(new Person("Lorena", "Aristizábal", 19, 1234));
        personsList.add(new Person("Patricia", "Gutiérrez", 46, 1235));
        personsList.add(new Person("Ernesto", "Moreno", 35, 1236));
        personsList.add(new Person("Manuela", "Tesone", 21, 1237));
        personsList.add(new Person("Óscar", "Correa", 41, 1238));
        personsList.add(new Person("Felipe", "Quesada", 29, 1239));

        return personsList;
    }

    public Integer verifyPerson() {

        System.out.println("Ingresa tu número de identificación:");
        int id = input.nextInt();
        input.nextLine();

        Integer i = 0;
        for (Person aux : personsList) {
            if (aux.getId().equals(id)) {
                System.out.println("¡Hola, " + aux.getName() + "!");
                break;
            }
            i++;
        }

        if (i == personsList.size()) {
            i = -1;
        }

        if (personsList.get(i).getPet() != null) {
            i = -2;
        }

        return i;

    }

    public void adopt(ArrayList<Dog> dogsList) {

        Integer personIndexDatabase = verifyPerson();

        switch (personIndexDatabase) {
            case -2:
                System.out.println("Ya has adoptado un perrito, no puedes adoptar otro.");
                break;
            case -1:
                System.out.println("No se encontró el ID en el sistema, así que no puedes adoptar.");
                break;
            default: // 0 or greater
                System.out.println("Los perritos actualmente en adopción son:");
                servDog.printDogsForAdoption(dogsList);

                System.out.println("\n¿Cuál perrito deseas adoptar?");
                String name = input.nextLine();

                Dog dogToAdopt = servDog.verifyDog(name, dogsList);

                if (dogToAdopt == null) {
                    System.out.println(name + " no existe en nuestra base de datos. Vuelve a intentarlo con otro nombre.");
                } else {
                    if (dogToAdopt.isAdopted()) {
                        System.out.println("Lo sentimos. " + name + " ya ha sido adoptado/a.");
                    } else {
                        personsList.get(personIndexDatabase).setPet(dogToAdopt);
                        Integer dogIndexDatabase = dogsList.indexOf(dogToAdopt);
                        dogsList.get(dogIndexDatabase).setAdopted(true);
                        dogsList.remove(dogToAdopt);
                        System.out.println("¡Felicitaciones! Has adoptado a " + dogToAdopt.getName() + ".");
                    }
                }
                break;
        }

    }

    public void printPerson() {
        
        for (Person aux : personsList) {
            System.out.println(aux.toString());
        }

    }

}
