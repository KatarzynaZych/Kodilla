package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    double field;

    public Square(double base) {
        this.shapeName = shapeName;
        this.field = base*base;
    }


    public String getShapeName() {

        shapeName = "square";

        return shapeName;
    }

    @Override
    public double getField() {

        return field;
    }
}
