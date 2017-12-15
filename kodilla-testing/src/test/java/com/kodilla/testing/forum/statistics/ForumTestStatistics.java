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

    public Statistics createTestData(int usersNumber, int postsNumber, int commentsNumber){

        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<usersNumber; i++ ){
            usersNamesList.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        return statisticsMock;
    }

    @Test
    public void testAverageCommentsPerUser() {
        //Given
        ForumStatistics forumStatisticsPost0 = new ForumStatistics(createTestData(100,0,0));
        ForumStatistics forumStatisticsPosts1000 = new ForumStatistics(createTestData(100,1000,100));
        ForumStatistics forumStatisticsComments0 = new ForumStatistics(createTestData(100,1000,0));
        ForumStatistics forumStatisticsMoreComments = new ForumStatistics(createTestData(100,100,500));
        ForumStatistics forumStatisticsMorePosts = new ForumStatistics(createTestData(100,500,100));
        ForumStatistics forumStatisticsUsers0 = new ForumStatistics(createTestData(0,10,100));
        ForumStatistics forumStatisticsUsers1000 = new ForumStatistics(createTestData(1000,10,20));

        //When

       forumStatisticsPost0.calculateAdvStatistics(createTestData(100,0,0));
       forumStatisticsPosts1000.calculateAdvStatistics(createTestData(100,1000,100));
       forumStatisticsComments0.calculateAdvStatistics(createTestData(100,1000,0));
       forumStatisticsMoreComments.calculateAdvStatistics(createTestData(100,100,500));
       forumStatisticsMorePosts.calculateAdvStatistics(createTestData(100,500,100));
       forumStatisticsUsers0.calculateAdvStatistics(createTestData(0,10,100));
       forumStatisticsUsers1000.calculateAdvStatistics(createTestData(1000,10,200));

        //Then
        Assert.assertEquals(0,forumStatisticsPost0.getAverageCommentsPerUser(),.001);
        Assert.assertEquals(1,forumStatisticsPosts1000.getAverageCommentsPerUser(),.001);
        Assert.assertEquals(0,forumStatisticsComments0.getAverageCommentsPerUser(),.001);
        Assert.assertEquals(5,forumStatisticsMoreComments.getAverageCommentsPerUser(),.001);
        Assert.assertEquals(1,forumStatisticsMorePosts.getAverageCommentsPerUser(),.001);
        Assert.assertEquals(0,forumStatisticsUsers0.getAverageCommentsPerUser(),.001);
        Assert.assertEquals(0.2,forumStatisticsUsers1000.getAverageCommentsPerUser(),.001);
    }

    @Test
    public void testAveragePostsPerUser() {

        //Given
        ForumStatistics forumStatisticsPost0 = new ForumStatistics(createTestData(100,0,0));
        ForumStatistics forumStatisticsPosts1000 = new ForumStatistics(createTestData(100,1000,100));
        ForumStatistics forumStatisticsComments0 = new ForumStatistics(createTestData(100,1000,0));
        ForumStatistics forumStatisticsMoreComments = new ForumStatistics(createTestData(100,100,500));
        ForumStatistics forumStatisticsMorePosts = new ForumStatistics(createTestData(100,500,100));
        ForumStatistics forumStatisticsUsers0 = new ForumStatistics(createTestData(0,10,100));
        ForumStatistics forumStatisticsUsers1000 = new ForumStatistics(createTestData(1000,10,20));

        //When

        forumStatisticsPost0.calculateAdvStatistics(createTestData(100,0,0));
        forumStatisticsPosts1000.calculateAdvStatistics(createTestData(100,1000,100));
        forumStatisticsComments0.calculateAdvStatistics(createTestData(100,1000,0));
        forumStatisticsMoreComments.calculateAdvStatistics(createTestData(100,100,500));
        forumStatisticsMorePosts.calculateAdvStatistics(createTestData(100,500,100));
        forumStatisticsUsers0.calculateAdvStatistics(createTestData(0,10,100));
        forumStatisticsUsers1000.calculateAdvStatistics(createTestData(1000,10,200));

        //Then
        Assert.assertEquals(0,forumStatisticsPost0.getAveragePostsPerUser(),.001);
        Assert.assertEquals(10,forumStatisticsPosts1000.getAveragePostsPerUser(),.001);
        Assert.assertEquals(10,forumStatisticsComments0.getAveragePostsPerUser(),.001);
        Assert.assertEquals(1,forumStatisticsMoreComments.getAveragePostsPerUser(),.001);
        Assert.assertEquals(5,forumStatisticsMorePosts.getAveragePostsPerUser(),.001);
        Assert.assertEquals(0,forumStatisticsUsers0.getAveragePostsPerUser(),.001);
        Assert.assertEquals(0.01,forumStatisticsUsers1000.getAveragePostsPerUser(),.001);

    }

    @Test // when comments count = 0
    public void testAverageCommentsPerPost() {
        //Given
        ForumStatistics forumStatisticsPost0 = new ForumStatistics(createTestData(100,0,0));
        ForumStatistics forumStatisticsPosts1000 = new ForumStatistics(createTestData(100,1000,100));
        ForumStatistics forumStatisticsComments0 = new ForumStatistics(createTestData(100,1000,0));
        ForumStatistics forumStatisticsMoreComments = new ForumStatistics(createTestData(100,100,500));
        ForumStatistics forumStatisticsMorePosts = new ForumStatistics(createTestData(100,500,100));
        ForumStatistics forumStatisticsUsers0 = new ForumStatistics(createTestData(0,10,100));
        ForumStatistics forumStatisticsUsers1000 = new ForumStatistics(createTestData(1000,10,20));

        //When

        forumStatisticsPost0.calculateAdvStatistics(createTestData(100,0,0));
        forumStatisticsPosts1000.calculateAdvStatistics(createTestData(100,1000,100));
        forumStatisticsComments0.calculateAdvStatistics(createTestData(100,1000,0));
        forumStatisticsMoreComments.calculateAdvStatistics(createTestData(100,100,500));
        forumStatisticsMorePosts.calculateAdvStatistics(createTestData(100,500,100));
        forumStatisticsUsers0.calculateAdvStatistics(createTestData(0,10,100));
        forumStatisticsUsers1000.calculateAdvStatistics(createTestData(1000,10,200));

        //Then
        Assert.assertEquals(0,forumStatisticsPost0.getAverageCommentsPerPost(),.001);
        Assert.assertEquals(0.1,forumStatisticsPosts1000.getAverageCommentsPerPost(),.001);
        Assert.assertEquals(0,forumStatisticsComments0.getAverageCommentsPerPost(),.001);
        Assert.assertEquals(5,forumStatisticsMoreComments.getAverageCommentsPerPost(),.001);
        Assert.assertEquals(0.2,forumStatisticsMorePosts.getAverageCommentsPerPost(),.001);
        Assert.assertEquals(10,forumStatisticsUsers0.getAverageCommentsPerPost(),.001);
        Assert.assertEquals(20,forumStatisticsUsers1000.getAverageCommentsPerPost(),.001);

    }

}
