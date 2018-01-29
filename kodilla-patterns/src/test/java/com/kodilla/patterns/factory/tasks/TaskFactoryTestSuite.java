package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);

        //Then
        Assert.assertEquals(false,shopping.isTaskExecuted());
        Assert.assertEquals("Shopping task 1", shopping.getTaskName());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTINGTASK);

        //Then
        Assert.assertEquals(false,painting.isTaskExecuted());
        Assert.assertEquals("Painting task 2", painting.getTaskName());
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVINGTASK);

        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Driving task 3", driving.getTaskName());
    }
}
