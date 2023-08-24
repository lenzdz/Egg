package ejercicioextra02_distancepoints;

import Entities.Points;
import Services.PointsServices;

public class EjercicioExtra02_DistancePoints {

    public static void main(String[] args) {
        
        PointsServices servPoints = new PointsServices();
        Points points1 = servPoints.createPoints();
        
        servPoints.calculateDistance(points1);
        
    }
    
}
