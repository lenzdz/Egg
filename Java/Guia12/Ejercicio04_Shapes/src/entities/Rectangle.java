package entities;

import interfaces.ShapeFormulas;

public final class Rectangle implements ShapeFormulas {

    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double perimeter() {
        return (this.height * 2) + (this.width * 2);
    }

    @Override
    public double area() {
        return this.width * this.height;
    }
}
