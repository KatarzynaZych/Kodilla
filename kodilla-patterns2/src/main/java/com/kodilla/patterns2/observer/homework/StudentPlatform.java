package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentPlatform implements Observable {

    private final List<String> homeworkList;
    private final String homework;
    private final List<Observer> observers;

    public StudentPlatform(String homework) {
        observers = new ArrayList<>();
        homeworkList = new ArrayList<>();
        this.homework = homework;
    }

    public void addHomework(String homework){
        homeworkList.add(homework);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getHomeworkList() {
        return homeworkList;
    }

    public String getHomework() {
        return homework;
    }

}
