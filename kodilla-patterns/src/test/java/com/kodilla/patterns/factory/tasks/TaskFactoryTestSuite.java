package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        String executed = shopping.executeTask(LocalDateTime.of(2001,12,11,12,00));

        //Then
        Assert.assertEquals(true,shopping.isTaskExecuted(executed));
        Assert.assertEquals("Shopping task 1", shopping.getTaskName());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        String executed = painting.executeTask(LocalDateTime.of(2018,12,11,12,00));


        //Then
        Assert.assertEquals(false,painting.isTaskExecuted(executed));
        Assert.assertEquals("Painting task 2", painting.getTaskName());
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        String executed = driving.executeTask(LocalDateTime.of(2015,12,11,12,00));


        //Then
        Assert.assertTrue(driving.isTaskExecuted(executed));
        Assert.assertEquals("Driving task 3", driving.getTaskName());
    }
}
