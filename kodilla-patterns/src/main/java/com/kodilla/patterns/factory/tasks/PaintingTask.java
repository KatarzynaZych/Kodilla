package com.kodilla.patterns.factory.tasks;

import java.time.LocalDateTime;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    String taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask(LocalDateTime dueDate) {

        if (LocalDateTime.now().isAfter(dueDate) || LocalDateTime.now().isEqual(dueDate)){
            taskExecuted = "is done";
            System.out.println("Painting task " + taskExecuted);

        }else{
            taskExecuted = "is not done";
            System.out.println("Painting " + taskExecuted);

        }
        return taskExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName + " task 2";
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
