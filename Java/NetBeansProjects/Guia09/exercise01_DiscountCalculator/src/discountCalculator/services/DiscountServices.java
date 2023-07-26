package discountCalculator.services;

import discountCalculator.entities.Discount;

public class DiscountServices {
    
    public Discount createDiscount() {
        
        return new Discount(100,10);
        
    }
    
    public double calculateDiscount(Discount discountInfo) {
        
        double amountDiscounted = (discountInfo.getMoney()*discountInfo.getDiscount())/100;
        double finalPrice = discountInfo.getMoney() - amountDiscounted;
        
        return finalPrice;
        
    }
    
}
