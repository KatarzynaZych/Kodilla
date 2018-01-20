package challengeTwo;

public class App {

    public static void main(String[] args) {

        FlightDirectory flightDirectory = new FlightDirectory();
        String arrivalAirport = "Paris";
        String departAirport = "Katowice";
        String stopoverAirport = "London";


        System.out.println("All flights to " + arrivalAirport + ":" );
        FindDestination findDestination = new FindDestination();
        findDestination.findDestination(flightDirectory,arrivalAirport);

        System.out.println("All flights from " + departAirport + ":" );
        FindFrom findFrom = new FindFrom();
        findFrom.findFrom(flightDirectory,departAirport);

        System.out.println("All flights with stopover in " + stopoverAirport + ":" );
        FindStopover findStopover = new FindStopover();
        findStopover.findStopover(flightDirectory,stopoverAirport);

    }
}