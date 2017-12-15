package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestStatistics {

    public ForumTestStatistics() {
    }

    @Test
    public void testAverageCommentsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int usersNumber = 0;
        int postsNumber = 10;
        int commentsNumber = 0;
        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<usersNumber; i++ ){
            usersNamesList.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        //When
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,forumStatistics.getAverageCommentsPerUser(),.01);

    }

    @Test
    public void testAveragePostsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int usersNumber = 100;
        int postsNumber = 1000;
        int commentsNumber = 100;
        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<usersNumber; i++ ){
            usersNamesList.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        //When
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10,forumStatistics.getAveragePostsPerUser(),.01);

    }

    @Test
    public void testAverageCommentsPerPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int usersNumber = 100;
        int postsNumber = 100;
        int commentsNumber = 50;
        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<usersNumber; i++ ){
            usersNamesList.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        //When
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.5,forumStatistics.getAverageCommentsPerPost(),.00001);

    }

}
