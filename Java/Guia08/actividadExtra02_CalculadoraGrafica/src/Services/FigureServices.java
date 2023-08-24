package Services;

import Entities.Figure;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class FigureServices {
    
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");
    Scanner input = new Scanner(System.in);
    
    public Figure createFigure() {
        
        input.useLocale(Locale.US); // Leer separador decimal como puntos en vez de comas en terminal
        
        String type;
        do {
            
            System.out.println("Write the name of the figure you want to analyze:");
            type = input.nextLine().toLowerCase();
            
            if (!type.equals("circle") && !type.equals("square") && !type.equals("rectangle") && !type.equals("triangle") && !type.equals("pentagon") && !type.equals("hexagon") && !type.equals("rhombus")) {
                System.out.println("Invalid figure. Please, try again.");
            }
            
        } while (!type.equals("circle") && !type.equals("square") && !type.equals("rectangle") && !type.equals("triangle") && !type.equals("pentagon") && !type.equals("hexagon") && !type.equals("rhombus"));
        
        System.out.println("All values submitted onwards will be converted to their absolute value.");
        if (type.equals("circle") || type.equals("square") || type.equals("pentagon") || type.equals("hexagon") || type.equals("rhombus")) {
            
            if (type.equals("circle")) {
                System.out.println("Write the " + type + "'s radius:");
            } else {
                System.out.println("Write the " +  type + "'s side length:");
            }
            double radiusOrSideLength = Math.abs(input.nextDouble());

            return new Figure(type, radiusOrSideLength);
            
        } else if (type.equals("triangle")) {
            
            System.out.println("Write the " + type + "'s side length:");
            double radiusOrSideLength = Math.abs(input.nextDouble());
            
            System.out.println("Write the " + type + "'s height:");
            double height = Math.abs(input.nextDouble());
            
            System.out.println("Write the " + type + "'s base:");
            double base = Math.abs(input.nextDouble());
            
            return new Figure(type, radiusOrSideLength, height, base);
            
        } else {
            
            System.out.println("Write the " + type + "'s height:");
            double height = Math.abs(input.nextDouble());
            
            System.out.println("Write the " + type + "'s base:");
            double base = Math.abs(input.nextDouble());

            return new Figure(type, height, base);
            
        }
        
    }
    
    public void calculatePerimeter(Figure fig) {
        
        double perimeter;
        switch (fig.getType()) {
            case "circle":
                
                perimeter = Math.PI * fig.getRadiusOrSideLength() * 2;
                System.out.println("Your circle's perimeter is " + decimalFormat.format(perimeter));
                break;
                
            case "square":
                
                perimeter = fig.getRadiusOrSideLength() * 4;
                System.out.println("Your square's perimeter is " + decimalFormat.format(perimeter));
                break;
                
            case "rectangle":
                
                perimeter = 2 * (fig.getBase() + fig.getHeight());
                System.out.println("Your rectangle's perimeter is " + decimalFormat.format(perimeter));
                break;
                
            case "triangle":
                
                perimeter = fig.getRadiusOrSideLength() * 3;
                System.out.println("Your triangle's perimeter is " + decimalFormat.format(perimeter));
                break;
                
            case "pentagon":
                
                perimeter = fig.getRadiusOrSideLength() * 5;
                System.out.println("Your pentagon's perimeter is " + decimalFormat.format(perimeter));
                break;
                
            case "hexagon":
                
                perimeter = fig.getRadiusOrSideLength() * 6;
                System.out.println("Your hexagon's perimeter is " + decimalFormat.format(perimeter));
                break;
                
            case "rhombus":
                
                perimeter = fig.getRadiusOrSideLength() * 4;
                System.out.println("Your rhombus' perimeter is " + decimalFormat.format(perimeter));
                break;
        }
        
    }
    
    public void calculateArea(Figure fig) {
        
        double area;
        double apothem;
        switch (fig.getType()) {
            case "circle":
                
                area = Math.PI * Math.pow(fig.getRadiusOrSideLength(),2);
                System.out.println("Your circle's area is " + decimalFormat.format(area));
                break;
                
            case "square":
                
                area = Math.pow(fig.getRadiusOrSideLength(), 2);
                System.out.println("Your square's area is " + decimalFormat.format(area));
                break;
                
            case "rectangle":
                
                area = fig.getBase() * fig.getHeight();
                System.out.println("Your rectangle's area is " + decimalFormat.format(area));
                break;
                
            case "triangle":
                
                area = (fig.getBase() * fig.getHeight())/2;
                System.out.println("Your triangle's area is " + decimalFormat.format(area));
                break;
                
            case "pentagon":
                
                apothem = fig.getRadiusOrSideLength()/(2 * Math.tan(36));
                area = ((fig.getRadiusOrSideLength() * 5) * apothem) / 2;
                System.out.println("Your pentagon's area is " + decimalFormat.format(area));
                break;
                
            case "hexagon":
                
                apothem = Math.sqrt(3*fig.getRadiusOrSideLength())/2;
                area = ((fig.getRadiusOrSideLength() * 5) * apothem) / 2;
                System.out.println("Your hexagon's area is " + decimalFormat.format(area));
                break;
                
            case "rhombus":

                area = Math.pow(fig.getRadiusOrSideLength(), 2);
                System.out.println("Your rhombus' area is " + decimalFormat.format(area));
                break;
        }
        
    }
    
}
