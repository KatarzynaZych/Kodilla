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
        ArrayList<Integer> allNumbers = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        // when
        ArrayList<Integer> results = exterminator.exterminate(allNumbers);
        System.out.println("Testing " + results);

        // then
        Assert.assertEquals(0, results.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        // given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(51);
        numbers.add(60);
        numbers.add(21);
        numbers.add(21);
        numbers.add(20);
        numbers.add(61);
        numbers.add(51);
        numbers.add(22);
        numbers.add(56);
        numbers.add(61);

        ArrayList<Integer> evenNumber = new ArrayList<Integer>();
        evenNumber.add(60);
        evenNumber.add(20);
        evenNumber.add(22);
        evenNumber.add(56);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        // when
        ArrayList<Integer> results = exterminator.exterminate(numbers);
        System.out.println("Testing " + results);

        //Then
        Assert.assertEquals(evenNumber, results);
    }

    @Test
    public void testOneEvenNumber(){

        // given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(60);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        // when
        ArrayList<Integer> results = exterminator.exterminate(numbers);
        System.out.println("Testing " + results);

        //Then
        Assert.assertEquals(1, results.size());
        int evenResult = results.get(0);
        Assert.assertEquals(60, evenResult);

    }

    @Test
    public void testOneOddNumber(){

        // given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(61);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        // when
        ArrayList<Integer> results = exterminator.exterminate(numbers);
        System.out.println("Testing " + results);

        //Then
        Assert.assertEquals(0, results.size());
        Assert.assertTrue(results.isEmpty());
    }
}