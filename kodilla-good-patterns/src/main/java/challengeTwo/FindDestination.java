package challengeTwo;

import java.util.List;
import java.util.stream.Collectors;

public class FindDestination {

    public List findDestination(FlightDirectory flightDirectory, String wantedAirport){

        List flights = flightDirectory.getList().stream()
                .filter(flight -> flight.getDestination().equals(wantedAirport))
                .collect(Collectors.toList());

        flights.forEach(System.out::println);
        return flights;
    }
}
