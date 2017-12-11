package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
        }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        // given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        // when
        ArrayList<Integer> results = exterminator.exterminate(numbers);
        System.out.println("Testing " + results);

        // then
        Assert.assertEquals(evenNumbers, results);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        // given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(55);
        numbers.add(62);
        numbers.add(21);
        numbers.add(22);
        numbers.add(20);
        numbers.add(67);
        numbers.add(52);

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        evenNumbers.add(10);
        evenNumbers.add(62);
        evenNumbers.add(22);
        evenNumbers.add(20);
        evenNumbers.add(52);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        // when
        ArrayList<Integer> results = exterminator.exterminate(numbers);
        System.out.println("Testing " + results);

        //Then
        Assert.assertEquals(evenNumbers, results);
    }
}