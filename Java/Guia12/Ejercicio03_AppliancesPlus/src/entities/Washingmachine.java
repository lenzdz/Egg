package entities;

import enumerators.Color;
import enumerators.EnergyConsumption;

public class Washingmachine extends Appliance{

    private Integer load;

    public Washingmachine() {
    }

    public Washingmachine(Integer price, Color color, EnergyConsumption energyConsumption, Integer weight, Integer load) {
        super(price, color, energyConsumption, weight);
        this.load = load;
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if (this.load > 30) {
            this.price += 500;
        }
    }

    @Override
    public String toString() {
        return "Washingmachine {" +
                "price=" + price +
                ", color=" + color +
                ", energyConsumption=" + energyConsumption +
                ", weight=" + weight +
                ", load=" + load +
                '}';
    }

}
