package com.kodilla.testing.collection;

import java.lang.*;
import java.util.*;

public class OddNumbersExterminator {

    //ArrayList<Integer> numbers = new ArrayList<Integer>();


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {


        ArrayList<Integer> result = new ArrayList<>();


        for (int number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }

        return result;
    }
}
