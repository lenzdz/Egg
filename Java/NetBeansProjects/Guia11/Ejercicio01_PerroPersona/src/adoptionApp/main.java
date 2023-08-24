package adoptionApp;

import entities.Dog;
import entities.Person;

public class main {

    public static void main(String[] args) {
        
        Dog pet1 = new Dog("Queso", "Golden", 2, 70);
        Dog pet2 = new Dog("Bocadillo", "Puddle", 5, 52);
        
        Person pers1 = new Person("Lena", "Paredes", 24, 1019144990, pet2);
        Person pers2 = new Person("Camilo", "Moreno", 38, 56788125, pet1);
        
        System.out.println(pers1);
        System.out.println(pers2);
        
    }
    
}
