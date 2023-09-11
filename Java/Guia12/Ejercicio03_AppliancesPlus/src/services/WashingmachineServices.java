package services;

import entities.Washingmachine;
import enumerators.Color;
import enumerators.EnergyConsumption;


public class WashingmachineServices {

    public Washingmachine createWashingmachine(Integer price, Color color, EnergyConsumption energyConsumption, Integer weight, Integer load) {
        return new Washingmachine(price, color, energyConsumption, weight, load);
    }
}
