package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("word",text -> "ABC" + text + "ABC");
//        poemBeautifier.beautify("word",text ->  text +"验版");
//        poemBeautifier.beautify("word", text -> '♠' + text);
//        poemBeautifier.beautify("word",String::toUpperCase);
//        poemBeautifier.beautify("WORD",String::toLowerCase);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }



}
