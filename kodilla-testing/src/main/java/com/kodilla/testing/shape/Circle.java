package com.kodilla.testing.shape;

public class Circle implements Shape {

   private String shapeName;
   private double field;

    public Circle(double radius) {
        this.field = 3.14 * radius * radius;
    }

    public String getShapeName() {

        shapeName = "circle";

        return shapeName;
    }

    public double getField() {

        return field;
    }


}
