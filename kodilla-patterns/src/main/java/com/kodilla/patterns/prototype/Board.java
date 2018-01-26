package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype{

    String name;
    Set<TasksList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (TasksList list: lists){
            s = s + lists.toString() + "\n";
        }
        return s;
    }

    public Board deepCopy() throws CloneNotSupportedException{
        Board boardClone = (Board) super.clone();
        boardClone.lists = new HashSet<>();
        for (TasksList theList: lists ){
            TasksList clonedList = new TasksList(theList.getName());
            for (Task task: clonedList.getTasks()){
                clonedList.getTasks().add(task);
            }
            boardClone.getLists().add(clonedList);
        }

        return boardClone;
    }


    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board) super.clone();
    }

}
