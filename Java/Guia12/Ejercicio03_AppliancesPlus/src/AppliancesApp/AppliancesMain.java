package AppliancesApp;

import entities.Appliance;
import entities.Television;
import entities.Washingmachine;
import enumerators.Color;
import enumerators.EnergyConsumption;
import services.TelevisionServices;
import services.WashingmachineServices;

import java.util.ArrayList;

public class AppliancesMain {
    public static void main(String[] args) {

        WashingmachineServices servWashingmachine = new WashingmachineServices();
        Appliance washingMachine1 = servWashingmachine.createWashingmachine(1000, Color.AZUL, EnergyConsumption.F, 25, 12);
        Appliance washingMachine2 = servWashingmachine.createWashingmachine(1000, Color.ROJO, EnergyConsumption.B, 50, 35);

        TelevisionServices servTelevision = new TelevisionServices();
        Appliance television1 = servTelevision.createTelevision(1000, Color.BLANCO, EnergyConsumption.E, 12, 32d, true);
        Appliance television2 = servTelevision.createTelevision(1000, Color.NEGRO, EnergyConsumption.D, 10, 54d, true);

        ArrayList<Appliance> myAppliaces = new ArrayList<>();
        myAppliaces.add(washingMachine1);
        myAppliaces.add(washingMachine2);
        myAppliaces.add(television1);
        myAppliaces.add(television2);

        int i = 1;
        Integer washingMachineSum = 0;
        Integer televisionSum = 0;
        Integer totalSum = 0;
        for (Appliance aux: myAppliaces) {

            aux.finalPrice();
            System.out.println("El precio final del Electrodoméstico #" + i + " [" + aux.getClass().getSimpleName() + "] es $" + aux.getPrice() + ".");

            totalSum += aux.getPrice();
            i++;

            if (aux.getClass().getSimpleName().equalsIgnoreCase("Washingmachine")) {
                washingMachineSum += aux.getPrice();
            } else {
                televisionSum += aux.getPrice();
            }
        }

        System.out.println("\nEl precio total de todas las lavadoras es $" + washingMachineSum + ".");
        System.out.println("El precio total de todos los televisores es $" + televisionSum + ".");
        System.out.println("El precio total de todos los electrodomésticos es $" + totalSum + ".");

    }
}