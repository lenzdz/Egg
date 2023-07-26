package exercise01_discountcalculator;

import discountCalculator.entities.Discount;
import discountCalculator.services.DiscountServices;

public class Exercise01_DiscountCalculator {

    public static void main(String[] args) {
        
        DiscountServices servDiscount = new DiscountServices();
        Discount discountInfo = servDiscount.createDiscount();
        
        double finalPrice = servDiscount.calculateDiscount(discountInfo);
        System.out.println("Your final price after the discount is: " + finalPrice);
    }
    
}
