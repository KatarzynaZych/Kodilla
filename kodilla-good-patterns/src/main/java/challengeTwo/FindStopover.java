package challengeTwo;

import java.util.List;
import java.util.stream.Collectors;

public class FindStopover {

    public List findStopover(FlightDirectory flightDirectory,String wantedAirport){

        List flights = flightDirectory.getList().stream()
                .filter(flight -> flight.getFrom().equals(wantedAirport)||flight.getDestination().equals(wantedAirport))
                .collect(Collectors.toList());

        flights.forEach(System.out::println);
        return flights;
    }
}
