package com.kodilla.exception;

public class ExceptionHandling {

    public static void main(String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2.5,1.5);

            System.out.println(result);
        } catch (Exception e){

            System.out.println("Problem with parametr's value. Because " + e);

        } finally {

            System.out.println("Comment");
        }
    }
}
