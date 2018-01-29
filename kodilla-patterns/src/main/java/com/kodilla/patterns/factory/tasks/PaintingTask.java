package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("This task wasn't done...");

    }

    @Override
    public String getTaskName() {
        return taskName + " task 2";
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
