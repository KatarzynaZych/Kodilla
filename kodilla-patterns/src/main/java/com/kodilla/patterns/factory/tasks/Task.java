package com.kodilla.patterns.factory.tasks;

import java.time.LocalDateTime;

public interface Task {
    boolean executeTask(LocalDateTime dueDate);
    String getTaskName() ;
    boolean isTaskExecuted() ;
}
