package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;



public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given

        int[] numbers = new int[10];
        numbers[0] = 30;
        numbers[1] = 15;
        numbers[2] = 15;
        numbers[3] = 15;
        numbers[4] = 15;
        numbers[5] = 15;
        numbers[6] = 15;
        numbers[7] = 15;
        numbers[8] = 15;
        numbers[9] = 0;

        //When
        double actualAverage = ArrayOperations.getAverage(numbers);

        // Then
        Assert.assertEquals(15,actualAverage,0.1);
        }
    }

