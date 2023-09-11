package services;

import entities.Television;
import enumerators.Color;
import enumerators.EnergyConsumption;

public class TelevisionServices {

    public Television createTelevision(Integer price, Color color, EnergyConsumption energyConsumption, Integer weight, Double resolution, Boolean tdt) {
        return new Television(price, color, energyConsumption, weight, resolution, tdt);
    }

}
