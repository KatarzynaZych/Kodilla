package com.kodilla.testing.calculator;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args){


        Calculator calculator = new Calculator();

        if(calculator.addAToB(4,6) == 10){

            System.out.println("test OK");

        }else {

            System.out.println("Error !");
        }

        if(calculator.subtractAFromB(5,2)==3){

            System.out.println("test OK");

        } else {

        System.out.println("Error !");

        }
    }
}
