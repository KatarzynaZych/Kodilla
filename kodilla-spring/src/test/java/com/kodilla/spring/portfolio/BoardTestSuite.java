package com.kodilla.spring.portfolio;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class BoardTestSuite {
    @Test
    public void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.getInProgressList();
        board.getToDoList();
        board.getDoneList();
    }
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addToDoneList("zupa");
        board.addToInProgressList("kurs");
        board.addToToDoList("zakupy");
        boolean results1 = board.getDoneList().getTasks().contains("zupa");
        boolean results2 = board.getInProgressList().getTasks().contains("kurs");
        boolean results3 = board.getToDoList().getTasks().contains("zakupy");

        //Then
        Assert.assertTrue(results1);
        Assert.assertTrue(results2);
        Assert.assertTrue(results3);
    }
}