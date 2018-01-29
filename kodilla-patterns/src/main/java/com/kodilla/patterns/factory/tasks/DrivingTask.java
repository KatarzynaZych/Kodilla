package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("This task was done...");
    }

    @Override
    public String getTaskName() {
        return taskName + " task 3";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
