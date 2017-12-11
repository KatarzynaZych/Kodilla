package com.kodilla.testing.collection;

import java.lang.*;
import java.util.*;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public ArrayList exterminate(ArrayList<Integer> numbers) {

        for (Integer number: numbers){

            if (number%2 == 0){

                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}

