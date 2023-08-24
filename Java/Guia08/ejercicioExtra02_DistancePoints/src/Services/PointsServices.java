package Services;

import Entities.Points;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PointsServices {
    
    Scanner input = new Scanner(System.in);
    
    public Points createPoints() {
        
        System.out.println("Submit the first X position:");
        double x1 = input.nextInt();
        
        System.out.println("Submit the first Y position:");
        double y1 = input.nextInt();
        
        System.out.println("Submit the second X position:");
        double x2 = input.nextInt();
        
        System.out.println("Submit the second Y position:");
        double y2 = input.nextInt();
        
        return new Points(x1, y1, x2, y2);
        
    }
    
    public void calculateDistance(Points points1) {
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        double squaredCathetusSum = Math.pow(points1.getX2() - points1.getX1(), 2) + Math.pow(points1.getY2() - points1.getY1(), 2);
        double distance = Math.sqrt(squaredCathetusSum);
        
        System.out.println("The distance between the first and the second position is " + df.format(distance));
        
    }
}
