package adoptionApp;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Dog;
import services.DogServices;
import services.PersonServices;

public class adoptionApp {

    static Scanner input = new Scanner(System.in, "Windows-1252");
    static PersonServices servPerson = new PersonServices();
    static DogServices servDog = new DogServices();

    public static void main(String[] args) throws Exception {
    
        servPerson.createPersons();
        ArrayList<Dog> dogsList = servDog.createDogs();
        
        menu(dogsList);

    }

    private static void menu(ArrayList<Dog> dogsList) {

        System.out.println("¡Bienvenido al sistema de adopción de perritos!");
    
        int choice;
        do {

            System.out.println("\nMENÚ");
            System.out.println("1) Adoptar un perrito");
            System.out.println("2) Ver perritos en adopción");
            System.out.println("3) Ver perritos adoptados y sus dueños");
            System.out.println("4) Salir");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    servPerson.adopt(dogsList);
                    break;
                case 2:
                    servDog.printDogsForAdoption(dogsList);
                    break;
                case 3:
                    servPerson.printPerson();
                    break;
                case 4:
                    continue;
                default:
                System.out.println("Opción inválida. Vuelve a intentarlo.");
                    break;
            }

        } while (choice != 4);

    }
}
