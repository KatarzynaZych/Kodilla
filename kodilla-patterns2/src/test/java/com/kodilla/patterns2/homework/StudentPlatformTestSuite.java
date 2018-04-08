package com.kodilla.patterns2.homework;

import com.kodilla.patterns2.observer.homework.*;
import org.junit.Assert;
import org.junit.Test;

public class StudentPlatformTestSuite {
    @Test
    public void testUpdate(){
        //given
        StudentPlatform task1 = new HomeworkOne();
        StudentPlatform task2 = new HomeworkTwo();
        StudentPlatform task3 = new HomeworkThree();
        MentorPlatform mentor1 = new MentorPlatform("Malcolm Turner");
        MentorPlatform mentor2 = new MentorPlatform("Timothy Widd");

        task1.registerObserver(mentor1);
        task2.registerObserver(mentor1);
        task3.registerObserver(mentor2);

        //when
        task1.addHomework("Results of student's no 1515");
        task1.addHomework("Results of student's no 1514");
        task1.addHomework("Results of student's no 1520");
        task1.addHomework("Results of student's no 1500");
        task1.addHomework("Results of student's no 1531");
        task2.addHomework("Results of student's no 1515");
        task2.addHomework("Results of student's no 1516");
        task2.addHomework("Results of student's no 1517");
        task3.addHomework("Results of student's no 1501");
        task3.addHomework("Results of student's no 1502");
        task3.addHomework("Results of student's no 1503");
        task3.addHomework("Results of student's no 1504");
        task3.addHomework("Results of student's no 1520");
        task3.addHomework("Results of student's no 1506");

        //then
        Assert.assertEquals(8,mentor1.getUpdateHomeworkCount());
        Assert.assertEquals(6,mentor2.getUpdateHomeworkCount());
    }
}
