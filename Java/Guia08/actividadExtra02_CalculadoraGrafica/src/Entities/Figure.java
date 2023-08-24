package Entities;

public class Figure {
    
    private String type;
    private double radiusOrSideLength; // Applicable to type "circle", "square", "pentagon", "hexagon", and "rhombus"
    private double height; // Applicable to type "rectangle" and "triangle"
    private double base; // Applicable to type "rectangle" and "triangle"

    public Figure() {
    }

    // Constructor for types "circle", "square", "pentagon", "hexagon", and "rhombus"
    public Figure(String type, double radiusOrSideLength) {
        this.type = type;
        this.radiusOrSideLength = radiusOrSideLength;
    }

    // Constructor for type "rectangle"
    public Figure(String type, double height, double base) {
        this.type = type;
        this.height = height;
        this.base = base;
    }

    // Constructor for type "triangle"
    public Figure(String type, double radiusOrSideLength, double height, double base) {
        this.type = type;
        this.radiusOrSideLength = radiusOrSideLength;
        this.height = height;
        this.base = base;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRadiusOrSideLength() {
        return radiusOrSideLength;
    }

    public void setRadiusOrSideLength(double radiusOrSideLength) {
        this.radiusOrSideLength = radiusOrSideLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
}
