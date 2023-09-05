package AnimalsApp;

import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Horse;

public class AnimalsMain {
    public static void main(String[] args) {

        Animal dog1 = new Dog("Ramón", "Croquetas", 5, "Bulldog");
        dog1.foodTaken();

        Animal dog2 = new Dog("Tito", "Concentrado", 8, "Labrador");
        dog2.foodTaken();

        Animal cat1 = new Cat("Lulo", "Leche", 3, "Siamés");
        cat1.foodTaken();

        Animal horse1 = new Horse("Veloz", "Zanahorias", 10, "Mustang");
        horse1.foodTaken();
    }
}