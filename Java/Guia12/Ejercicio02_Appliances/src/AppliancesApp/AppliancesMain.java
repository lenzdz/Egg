package AppliancesApp;

import entities.Appliance;
import entities.Television;
import entities.Washingmachine;
import services.TelevisionServices;
import services.WashingmachineServices;

import java.util.Scanner;

public class AppliancesMain {
    public static void main(String[] args) {

        System.out.println("CREACIÓN LAVADORA");
        WashingmachineServices servWashingmachine = new WashingmachineServices();
        Washingmachine myWashingmachine = servWashingmachine.createWashingmachine();
        System.out.println("El precio final de la lavadora es de $" + myWashingmachine.getPrice() + ".");

        System.out.println("CREACIÓN TELEVISOR");
        TelevisionServices servTelevision = new TelevisionServices();
        Television myTelevision = servTelevision.createTelevision();
        System.out.println("El precio final del televisor es de $" + myTelevision.getPrice() + ".");

        System.out.println(myWashingmachine);
        System.out.println(myTelevision);

    }
}