package com.kodilla.exception.main;

import com.kodilla.exception.Flight;
import com.kodilla.exception.RouteNotFoundException;

import java.util.HashMap;

public class FlightsFinder {

    private  static HashMap<String,Boolean> newFlight = new HashMap<>();


    public boolean findFlight (Flight flight) throws RouteNotFoundException {

        newFlight.put("Chicago-Tokyo",true);
        newFlight.put("Warsaw-London",true);
        newFlight.put("Katowice-Honolooloo",false);
        newFlight.put("Rome-London",true);

        if (newFlight.containsKey(flight.getDepartureAireport()+"-"+flight.getArrivalAirport())) {

            System.out.println("Flight was found !");
            return newFlight.get(flight.getDepartureAireport()+"-"+flight.getArrivalAirport());

        } else {

            throw new RouteNotFoundException("Flight not found !");
        }
    }
}
