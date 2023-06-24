package ejercicio04_rectangulo;

import Entidades.Rectangle;
import Servicios.RectangleServices;

public class Ejercicio04_Rectangulo {

    public static void main(String[] args) {
        
        RectangleServices rectServ = new RectangleServices();
        Rectangle rect = rectServ.createRectangle();
        
        System.out.println("¡Aquí está tu rectángulo!");
        rectServ.printRectangle(rect);
        
        System.out.println("Su perímtero es de " + rectServ.perimeter(rect) + " metros.");
        
        System.out.println("Su área es de " + rectServ.area(rect) + " metros cuadrados.");
        
    }
    
}
