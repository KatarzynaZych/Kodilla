package com.kodilla.spring.intro.shape;

public class Drawer {

    final Shape shape;

    // po co nam to final
    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}