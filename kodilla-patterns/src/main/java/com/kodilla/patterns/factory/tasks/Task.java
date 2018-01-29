package com.kodilla.patterns.factory.tasks;

import java.time.LocalDateTime;

public interface Task {
    String executeTask(LocalDateTime dueDate);
    String getTaskName() ;
    boolean isTaskExecuted(String taskExcuted) ;
}
