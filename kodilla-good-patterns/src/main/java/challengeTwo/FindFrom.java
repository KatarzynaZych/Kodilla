package challengeTwo;

import java.util.List;
import java.util.stream.Collectors;

public class FindFrom {

    public List findFrom(FlightDirectory flightDirectory, String wantedAirport){

       List flights = flightDirectory.getList().stream()
                .filter(flight -> flight.getFrom().equals(wantedAirport))
                .collect(Collectors.toList());

       flights.forEach(System.out::println);
       return flights;
    }
}
