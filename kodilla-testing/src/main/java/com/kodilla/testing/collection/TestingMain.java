package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.Random;

public class TestingMain {

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();

//        Random randomGenerator = new Random();
//        for (int i = 1; i < 10; i++) {
//            numbers.add(randomGenerator.nextInt(100));
//        }

        numbers.add(10);
        numbers.add(55);
        numbers.add(62);
        numbers.add(21);
        numbers.add(22);
        numbers.add(20);
        numbers.add(67);
        numbers.add(52);

        System.out.println(numbers);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList evenNumbers = exterminator.exterminate(numbers);

        System.out.println(evenNumbers);
    }
}