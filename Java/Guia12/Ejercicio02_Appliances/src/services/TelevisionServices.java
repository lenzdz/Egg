package services;

import entities.Appliance;
import entities.Television;

import java.util.Scanner;

public class TelevisionServices {

    Scanner input = new Scanner(System.in);
    ApplianceServices servAppliance = new ApplianceServices();

    public Television createTelevision() {

        Appliance myAppliance = servAppliance.createAppliance();

        Double resolution;
        do {
            System.out.println("Indique la resolución de la pantalla del televisor:");
            resolution = input.nextDouble();
            input.nextLine();

            if (resolution < 1) {
                System.out.println("Opción inválida. Vuelva a intentarlo.");
            }
        } while (resolution < 1);

        String hasTDT;
        do {
            System.out.println("Indique si el televisor tiene TDT (s/n):");
            hasTDT = input.nextLine();

            if (!hasTDT.equalsIgnoreCase("s") && !hasTDT.equalsIgnoreCase("n")) {
                System.out.println("Opción inválida. Vuelva a intentarlo.");
            }
        } while (!hasTDT.equalsIgnoreCase("s") && !hasTDT.equalsIgnoreCase("n"));

        Boolean tdt;
        if (hasTDT.equalsIgnoreCase("s")) {
            tdt = true;
        } else {
            tdt = false;
        }

        Television myTelevision = new Television(myAppliance.getPrice(), myAppliance.getColor(), myAppliance.getEnergyConsumption(), myAppliance.getWeight(), resolution, tdt);
        myTelevision.finalPrice();

        return myTelevision;

    }

}
