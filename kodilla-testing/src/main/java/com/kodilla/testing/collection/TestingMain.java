package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.Random;

public class TestingMain {

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList evenNumbers = exterminator.exterminate(numbers);

        System.out.println(evenNumbers);
    }
}