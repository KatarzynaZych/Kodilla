package com.kodilla.patterns.factory.tasks;

import java.time.LocalDateTime;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    String taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask(LocalDateTime dueDate) {

        if (LocalDateTime.now().isAfter(dueDate) || LocalDateTime.now().isEqual(dueDate)){
            taskExecuted = "is done";
            System.out.println("Driving task " + taskExecuted);

        }else{
            taskExecuted = "is not done";
            System.out.println("Driving task " + taskExecuted);

        }
        return taskExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName + " task 3";
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
