package com.kodilla.exception;

import java.util.HashMap;

public class Flight {

    String departureAireport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAireport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAireport() {
        return departureAireport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
