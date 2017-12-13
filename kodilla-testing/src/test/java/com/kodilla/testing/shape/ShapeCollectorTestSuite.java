package com.kodilla.testing.shape;
import com.kodilla.testing.shape.*;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Test
    public void testAddFigure(){

        // given
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(90));
        shapeCollector.addFigure(new Triangle(10,15.5));
        shapeCollector.addFigure(new Circle(45));

        // when
        shapeCollector.addFigure(new Square(45));

        // then
        Assert.assertEquals(4,shapeCollector.showFigures().size());

    }

    @Test
    public void testRemoveFigure() {

        ShapeCollector shapeCollector = new ShapeCollector();

        Circle circle = new Circle(90);
        Triangle triangle = new Triangle(10,15.5);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        // when
        boolean removed = shapeCollector.removeFigure(circle);

        // then
        Assert.assertTrue(removed);
    }

    @Test
    public void testGetFigure(){
        //Given

        ShapeCollector shapeCollector = new ShapeCollector();

        Circle circle = new Circle(90);
        Triangle triangle = new Triangle(10,15.5);
        Square square = new Square(10);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //When
        Shape retrievedFigure = shapeCollector.getFigure(1);

        //Then
        Assert.assertEquals(triangle , retrievedFigure);

    }

    @Test
    public void testShowFigures(){
        // given

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(90));
        shapeCollector.addFigure(new Square(10));
        shapeCollector.addFigure(new Triangle(10, 15.5));

        // when
        ArrayList<Shape> shownFigures = shapeCollector.showFigures();

        // then
        Assert.assertEquals(3,shownFigures.size());

    }
}
