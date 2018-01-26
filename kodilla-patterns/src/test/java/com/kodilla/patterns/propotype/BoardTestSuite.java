package com.kodilla.patterns.propotype;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {

    @Test
    public void testToString(){
        //given
        //creating the TasksList for todos
        TasksList listToDo = new TasksList("to do tasks");
        IntStream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To do task number " + n)));

        //creating the TaskList for tasks in progress
        TasksList listInProgress = new TasksList(" in progress");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n ->listInProgress.getTasks().add(new Task("In progress task number " + n)));

        // creating the TaskList for done tasks
        TasksList listDoneTask = new TasksList("done tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n->listDoneTask.getTasks().add(new Task("Done task number " + n)));

        //creating the board and assigning the lists
        Board board = new Board("project nr one");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDoneTask);


        //making shallow copy of object board
        Board boardClone = null;
        try {
            boardClone = board.shallowCopy();
            boardClone.setName("Project number 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        // making deep copy od object board
        Board boardDeepClone = null;
        try {
            boardDeepClone = board.deepCopy();
            boardDeepClone.setName("Project number 3");

        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //when
        board.getLists().remove(listToDo);

        // then
        System.out.println(board);
        System.out.println(boardClone);
        System.out.println(boardDeepClone);
        Assert.assertEquals(2,board.getLists().size());
        Assert.assertEquals(2,boardClone.getLists().size());
        Assert.assertEquals(3,boardDeepClone.getLists().size());
        Assert.assertEquals(board.getLists(),boardClone.getLists());
        Assert.assertNotEquals(board.getLists(),boardDeepClone.getLists());
    }
}
