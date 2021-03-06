package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
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

    public void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();

        if (quantityOfUsers == 0) {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        } else {
            averagePostsPerUser = quantityOfPosts / (double) quantityOfUsers;
            averageCommentsPerUser = quantityOfComments / (double) quantityOfUsers;
        }
        if (quantityOfComments > 0) {
            averageCommentsPerPost = quantityOfPosts / (double) quantityOfComments;
        } else {
            averageCommentsPerPost = 0;
        }
    }
}













