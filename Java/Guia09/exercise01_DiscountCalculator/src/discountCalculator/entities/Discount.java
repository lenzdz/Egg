package discountCalculator.entities;

public class Discount {
    
    private double money;
    private double discount;

    public Discount() {
    }

    public Discount(double money, double discount) {
        this.money = money;
        this.discount = discount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Discount{" + "money=" + money + ", discount=" + discount + '}';
    }
    
}
