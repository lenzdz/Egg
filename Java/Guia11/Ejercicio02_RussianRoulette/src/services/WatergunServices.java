package services;

import entities.Watergun;
import java.util.Random;

public class WatergunServices {
    
    public Watergun fillWatergun() {
        
        Watergun pistol = new Watergun();
        Random random = new Random();
        
        Integer currentPosition = random.nextInt(6-1+1)+1; // rand.nextInt(max - min + 1) + min)
        Integer waterPosition = random.nextInt(6-1+1)+1; // rand.nextInt(max - min + 1) + min)
                
        pistol.setCurrentPosition(currentPosition);
        pistol.setWaterPosition(waterPosition);
        
        System.out.println("Dev checkpoint = {Current position: " + currentPosition + "; Water position: " + waterPosition + "}.");
        
        return pistol;
    }
    
}
