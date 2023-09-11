package entities;

import interfaces.ShapeFormulas;

public final class Circle implements ShapeFormulas {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double perimeter() {
        return PI * this.radius * 2;
    }

    @Override
    public double area() {
        return PI * (Math.pow(this.radius,2));
    }
}
