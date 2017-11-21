package com.kodilla;

public class Calculator {

    int a;
    int b;

    public String calculator(int a, int b){

        int sum = a + b;
        int subtraction = a - b;

        return "sum = " + sum + " subtraction = " + subtraction;
    }

    public static void main(String[] args){

        Calculator result = new Calculator();
        System.out.println(result.calculator(5,3));

    }
}
