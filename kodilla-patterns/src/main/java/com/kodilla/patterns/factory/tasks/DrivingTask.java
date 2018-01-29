package com.kodilla.patterns.factory.tasks;

import java.time.LocalDateTime;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    boolean taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask(LocalDateTime dueDate) {
        if (LocalDateTime.now().isAfter(dueDate) || LocalDateTime.now().isEqual(dueDate)){
            taskExecuted = true;
            System.out.println("Driving task " + "is done");

        }else{
            taskExecuted = false;
            System.out.println("Driving task " + "is not done");

        }
        return taskExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName + " task 3";
    }


    @Override
    public boolean isTaskExecuted() {

        return taskExecuted;
    }
}
