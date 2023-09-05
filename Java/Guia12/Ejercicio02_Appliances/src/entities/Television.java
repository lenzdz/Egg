package entities;

import enumerators.Color;
import enumerators.EnergyConsumption;

public class Television extends Appliance{

    private Double resolution;
    private Boolean TDT;

    public Television() {
    }

    public Television(Double resolution, Boolean TDT) {
        this.resolution = resolution;
        this.TDT = TDT;
    }

    public Television(Integer price, Color color, EnergyConsumption energyConsumption, Integer weight, Double resolution, Boolean TDT) {
        super(price, color, energyConsumption, weight);
        this.resolution = resolution;
        this.TDT = TDT;
    }

    public Double getResolution() {
        return resolution;
    }

    public void setResolution(Double resolution) {
        this.resolution = resolution;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if (this.resolution > 40) {
            Double thirtyPercent = this.price * 0.3;
            this.price += thirtyPercent.intValue();
        }
        if (this.TDT) {
            this.price += 500;
        }
    }

    @Override
    public String toString() {
        return "Television{" +
                "price=" + price +
                ", color=" + color +
                ", energyConsumption=" + energyConsumption +
                ", weight=" + weight +
                ", resolution=" + resolution +
                ", TDT=" + TDT +
                '}';
    }

}
