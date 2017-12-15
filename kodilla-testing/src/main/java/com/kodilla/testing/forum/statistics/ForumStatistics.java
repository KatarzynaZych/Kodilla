package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    private Statistics statistics;

    private int usersCount = 0 ;
    private double averagePostsPerUser = 0 ;
    private double averageCommentsPerUser = 0 ;
    private double averageCommentsPerPost = 0 ;


    public int getUsersCount() {
        return usersCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

        usersCount = statistics.usersNames().size();

        if ( usersCount != 0 ) {
            averagePostsPerUser = (double) statistics.postsCount() / usersCount;
            averageCommentsPerUser = (double) statistics.commentsCount() / usersCount;
        }

        // zamiast if
        //averageCommentsPerPost=(statistics.postsCount()!= 0)?statistics.commentsCount() / statistics.postsCount():0;

        if( statistics.postsCount() != 0) {
            averageCommentsPerPost = (double)  statistics.commentsCount() / statistics.postsCount();
        }
    }

    public String ShowStatistics(){

        return "number of users : " + String.valueOf(statistics.usersNames().size()) + "\n average number of comments per user : " + averageCommentsPerUser + "\n average number of posts per user : " + averagePostsPerUser + "\n average number of comments per post" + averageCommentsPerPost;
    }
}
