package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

//    public ShapeCollector(ArrayList<Shape> shapeList) {
//       // this.shapeList = shapeList;
//    }


    public ShapeCollector() {
    }

    public boolean addFigure(Shape shape) {

        shapeList.add(shape);

        return true;
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


