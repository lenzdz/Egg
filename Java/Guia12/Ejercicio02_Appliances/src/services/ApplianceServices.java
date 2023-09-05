package services;

import entities.Appliance;

import enumerators.Color;
import enumerators.EnergyConsumption;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplianceServices {

    Scanner input = new Scanner(System.in);

    public Appliance createAppliance() {

        Color applianceColor = checkColor();
        EnergyConsumption energyConsumption = checkEnergyCons();

        Integer weight;
        do {
            System.out.println("¿Cuánto pesa el electrodoméstico?");
            weight = input.nextInt();
            input.nextLine();

            if (weight < 1) {
                System.out.println("Peso inválido. Por favor, vuelva a intentarlo.");
            }
        } while (weight < 1);

        return new Appliance(1000, applianceColor, energyConsumption, weight);

    }

    private Color checkColor() {

        System.out.println("¿De qué color desea su electrodoméstico?");
        String color = input.nextLine();

        for (Color aux: Color.values()) {
            if (aux.name().equalsIgnoreCase(color)) {
                return Color.valueOf(color.toUpperCase());
            }
        }

        return Color.BLANCO;

    }

    private EnergyConsumption checkEnergyCons() {

        System.out.println("¿Cuánta energía gasta el electrodoméstico?");
        String energy = input.nextLine();

        for (EnergyConsumption aux: EnergyConsumption.values()) {
            if (aux.name().equalsIgnoreCase(energy)) {
                return EnergyConsumption.valueOf(energy.toUpperCase());
            }
        }

        return EnergyConsumption.F;
    }
}
