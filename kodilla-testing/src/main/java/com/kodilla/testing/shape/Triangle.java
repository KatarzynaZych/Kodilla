package com.kodilla.testing.shape;

public class Triangle implements Shape{

    String shapeName;
    double field;

    public Triangle(double base, double height) {
        this.shapeName = shapeName;
        this.field = 0.5*base*height;
    }


    public String getShapeName() {

        shapeName = "triangle";

        return shapeName;
    }


    public double getField() {

        return field;
    }
}
