package com.kodilla.patterns.factory.tasks;

import java.time.LocalDateTime;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    boolean taskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask(LocalDateTime dueDate) {
        if (LocalDateTime.now().isAfter(dueDate) || LocalDateTime.now().isEqual(dueDate)){
            taskExecuted = true;
            System.out.println("Shopping task " + "is done");

        }else{
            taskExecuted = false;
            System.out.println("Shopping task " + "is not done");

        }
        return taskExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName + " task 1";
    }

    @Override
    public boolean isTaskExecuted() {

        return taskExecuted;
    }
}

