package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticstestSuite {
    @Test
    public void testGetaAerageNumberOfPostsPerUser(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesMock = new ArrayList<>();
        usersNamesMock.add("");
        usersNamesMock.add("");
        usersNamesMock.add("");

        int numberOfPosts = 4;
        int numberofComents = 4;
        when(statisticsMock.usersNames()).thenReturn(usersNamesMock);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberofComents);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        double result = calculateStatistics.getaAerageNumberOfPostsPerUser();

        //Then
        Assert.assertEquals(1.3333333333333333,result, 0.001);
    }
}
//