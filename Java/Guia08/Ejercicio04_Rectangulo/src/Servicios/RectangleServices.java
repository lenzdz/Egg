package Servicios;

import Entidades.Rectangle;
import java.util.Scanner;

public class RectangleServices {
    
    private final Scanner input = new Scanner(System.in);
    
    public Rectangle createRectangle() {
        
        System.out.println("¿Cuál es la altura de su rectángulo?");
        int height = input.nextInt();
        
        System.out.println("¿Cuál es el ancho de su rectángulo?");
        int width = input.nextInt();
        
        return new Rectangle(height, width);
        
    }
    
    public int area(Rectangle rect) {
        
        int x = rect.getHeight() * rect.getWidth();
        return x;
        
    }
    
    public int perimeter(Rectangle rect) {
        
        int x = (rect.getHeight()*2) + (rect.getWidth()*2);
        return x;
        
    }
    
    public void printRectangle(Rectangle rect) {
        
        String rectString = "";
        
        for (int i = 0; i < rect.getHeight(); i++) {
            for (int j = 0; j < rect.getWidth(); j++) {
                if (j == rect.getWidth()-1) {
                    rectString += "*"+"\n";
                } else if (i == 0 || i == rect.getHeight()-1 || j == 0) {
                    rectString += "* ";
                } else {
                    rectString += "  ";
                }
            }
        }
        
        System.out.println(rectString);
        
    }
    
}
