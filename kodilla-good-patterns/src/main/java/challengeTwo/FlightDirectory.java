package challengeTwo;

import java.util.ArrayList;
import java.util.List;

public final class FlightDirectory {

    private final List<Flight> theFlightsList = new ArrayList<>();

    public FlightDirectory() {
        theFlightsList.add(new Flight("Warsaw", "Berlin", " "));
        theFlightsList.add(new Flight("Paris", "London", " "));
        theFlightsList.add(new Flight("London", "Warsaw", " "));
        theFlightsList.add(new Flight("Rome", "San Francisco", "London"));
        theFlightsList.add(new Flight("Katowice", "Tokyo", "London"));
        theFlightsList.add(new Flight("Berlin", "Paris", " "));
        theFlightsList.add(new Flight("Madrid", "Dubai", "Frankfurt"));
        theFlightsList.add(new Flight("Warsaw", "Tokyo", " "));
        theFlightsList.add(new Flight("Paris", "Cuba", " Washington"));
        theFlightsList.add(new Flight("London", "Katowice", " "));
        theFlightsList.add(new Flight("Rome", "Latvia", "London"));
        theFlightsList.add(new Flight("Katowice", "Bangkok", "London"));
        theFlightsList.add(new Flight("Berlin", "Rome", " "));
        theFlightsList.add(new Flight("Paris", "Dubai", "Frankfurt"));
    }

    public List<Flight> getList() {
        return new ArrayList<>(theFlightsList);
    }
}

