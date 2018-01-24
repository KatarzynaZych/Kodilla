package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }
    
    public void taskAdd(String task){
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

}
