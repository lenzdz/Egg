package services;

import entities.Appliance;
import entities.Washingmachine;

import java.util.Scanner;

public class WashingmachineServices {

    Scanner input = new Scanner(System.in);
    ApplianceServices servAppliance = new ApplianceServices();

    public Washingmachine createWashingmachine() {

        Appliance myAppliance = servAppliance.createAppliance();

        Integer load;
        do {
            System.out.println("Indique la carga que soportará la lavadora:");
            load = input.nextInt();
            input.nextLine();

            if (load < 1) {
                System.out.println("Cantidad de carga inválida. Vuelva a intentarlo.");
            }
        } while (load < 1);

        Washingmachine myWashingMachine = new Washingmachine(myAppliance.getPrice(), myAppliance.getColor(), myAppliance.getEnergyConsumption(), myAppliance.getWeight(), load);
        myWashingMachine.finalPrice();

        return myWashingMachine;

    }
}
