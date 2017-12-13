package com.kodilla.testing.shape;

public class Square implements Shape {

   private String shapeName;
   private double field;

    public Square(double base) {
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
