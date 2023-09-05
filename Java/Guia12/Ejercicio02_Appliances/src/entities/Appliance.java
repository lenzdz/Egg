package entities;

import enumerators.Color;
import enumerators.EnergyConsumption;

public class Appliance {

    protected Integer price;
    protected Color color;
    protected EnergyConsumption energyConsumption;
    protected Integer weight;

    public Appliance() {
    }

    public Appliance(Integer price, Color color, EnergyConsumption energyConsumption, Integer weight) {
        this.price = price;
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public EnergyConsumption getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(EnergyConsumption energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Appliance {" +
                "price=" + price +
                ", color=" + color +
                ", energyConsumption='" + energyConsumption + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void finalPrice() {

        Integer energyConsumptionFee = 0;

        switch (this.energyConsumption) {
            case A -> energyConsumptionFee = 1000;
            case B -> energyConsumptionFee = 800;
            case C -> energyConsumptionFee = 600;
            case D -> energyConsumptionFee = 500;
            case E -> energyConsumptionFee = 300;
            case F -> energyConsumptionFee = 100;
        }

        Integer weightFee = 0;
        if (this.weight <= 19) {
            weightFee = 100;
        } else if (this.weight <= 49) {
            weightFee = 500;
        } else if (this.weight <= 79) {
            weightFee = 800;
        } else {
            weightFee = 1000;
        }

        this.price += (energyConsumptionFee + weightFee);
    }

}
