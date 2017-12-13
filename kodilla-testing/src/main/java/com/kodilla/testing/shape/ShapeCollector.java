package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

//    public ShapeCollector(ArrayList<Shape> shapeList) {
//       // this.shapeList = shapeList;
//    }


    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {

        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {

        shapeList.remove(shape);

        return true;
    }

    public Shape getFigure(int n) {

            return shapeList.get(n);
    }

    public ArrayList<Shape> showFigures() {

        return shapeList;
    }
}


