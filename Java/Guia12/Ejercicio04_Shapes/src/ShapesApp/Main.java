package ShapesApp;

import entities.Circle;
import entities.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.25);

        double circlePerimeter = circle.perimeter();
        System.out.println("El perímetro del círculo es " + circlePerimeter);

        double circleArea = circle.area();
        System.out.println("El área del círculo es " + circleArea);

        Rectangle rectangle = new Rectangle(12d,4d);

        double rectanglePerimeter = rectangle.perimeter();
        System.out.println("El perímetro del rectángulo es " + rectanglePerimeter);

        double rectangleArea = rectangle.area();
        System.out.println("El área del rectángulo es " + rectangleArea);

    }
}