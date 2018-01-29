package com.kodilla.patterns.factory.tasks;

import java.util.HashSet;
import java.util.Set;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping", "potatoes", 10.0);
            case PAINTINGTASK:
                return new PaintingTask("Painting","white","bedroom");
            case DRIVINGTASK:
                return new DrivingTask("Driving", "cinema","honda");

        default:
                return null;
        }
    }
}



