package services;

import java.util.ArrayList;

import entities.Dog;

public class DogServices {
    
    public ArrayList<Dog> createDogs() {

        ArrayList<Dog> dogsList = new ArrayList<>();

        dogsList.add(new Dog("Agata", "Poodle", 4, 52, false));
        dogsList.add(createDog("Pepe", "Labrador", 3, 98));
        dogsList.add(createDog("Sancho", "Bulldog", 12, 86));
        dogsList.add(createDog("Ganso", "Golden", 3, 100));
        dogsList.add(createDog("Horacio", "Husky", 6, 130));
        dogsList.add(createDog("Betty", "Chihuahua", 10, 32));
        dogsList.add(createDog("Coraline", "Poodle", 7, 47));
        dogsList.add(createDog("Kiko", "Pomerania", 8, 41));
        dogsList.add(createDog("Lulo", "Labrador", 1, 72));
        dogsList.add(createDog("Bardo", "Bulldog", 6, 85));

        return dogsList;
    }

    public Dog createDog(String name, String breed, Integer age, Integer height) {
        return new Dog(name, breed, age, height, false);
    }

    public void printDogsForAdoption(ArrayList<Dog> dogsList) {

        int i = 1;
        for (Dog aux : dogsList) {
            System.out.println("Perrito " + i + " " + aux.toString());
            i++;
        }

    }

    public Dog verifyDog(String name, ArrayList<Dog> dogsList) {

        Dog dogToAdopt = null;

        Integer i = 0;
        for (Dog aux : dogsList) {
            if (aux.getName().equalsIgnoreCase(name)) {
                dogToAdopt = aux;
                break;
            }
            i++;
        }

        return dogToAdopt;

    }

}
