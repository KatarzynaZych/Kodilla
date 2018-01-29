package com.kodilla.patterns.factory.tasks;

import java.time.LocalDateTime;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    boolean taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask(LocalDateTime dueDate) {
        if (LocalDateTime.now().isAfter(dueDate) || LocalDateTime.now().isEqual(dueDate)){
            taskExecuted = true;
            System.out.println("Painting task " + "is done");

        }else{
            taskExecuted = false;
            System.out.println("Painting task " + "is not done");

        }
        return taskExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName + " task 2";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
