package entities;

public class Cafetera {
    
    private double currentQuantity;
    private double maxCapacity;

    public Cafetera() {
    }

    public Cafetera(double currentQuantity, double maxCapacity) {
        this.currentQuantity = currentQuantity;
        this.maxCapacity = maxCapacity;
    }

    public double getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(double currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "currentQuantity=" + currentQuantity + ", maxCapacity=" + maxCapacity + '}';
    }
    
}
