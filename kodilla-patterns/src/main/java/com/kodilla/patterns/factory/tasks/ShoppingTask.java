package com.kodilla.patterns.factory.tasks;

import java.time.LocalDateTime;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    String taskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask(LocalDateTime dueDate) {
        if (LocalDateTime.now().isAfter(dueDate) || LocalDateTime.now().isEqual(dueDate)){
            taskExecuted = "is done";
            System.out.println("Shopping task " + taskExecuted);

        }else{
            taskExecuted = "is not done";
            System.out.println("Shopping task " + taskExecuted);

        }
        return taskExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName + " task 1";
    }

    @Override
    public boolean isTaskExecuted(String taskExcuted) {

        if(taskExcuted.equals("is done")){
            return true;
        }else {
        return false;
        }
    }
}
