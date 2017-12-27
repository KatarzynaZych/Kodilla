package com.kodilla.exception;

import com.kodilla.exception.main.FlightsFinder;

import java.util.HashMap;

public class RouteNotFoundExceptionRunner {

    public static void main(String[] args) throws RouteNotFoundException {

        // HashMap contains this flight;
        Flight flight1 = new Flight("Rome","London");

        // HashMap doesn't contain this flight;
        Flight flight2 = new Flight("Luton","London");

        FlightsFinder flightsFinder = new FlightsFinder();

        try {

        flightsFinder.findFlight(flight2);

        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found, but my program still running very well!");
        }

        System.out.println("Now, try flight 1");
    }
}
