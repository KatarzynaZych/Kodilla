package challengeTwo;

public class Flight {

    private String from;
    private String destination;
    private String stopover;
    private int flightNumber;

    public Flight(String from, String destination, String stopover) {
        this.from = from;
        this.destination = destination;
        this.stopover = stopover;
    }

    public String getFrom() {
        return from;
    }

    public String getDestination() {
        return destination;
    }

    public String getStopover() {
        return stopover;
    }

    @Override
    public String toString() {

        if(stopover.equals(" ")) {
            return "Flight: " +
                     from + " -> " +
                     destination + " \n" ;
        } else {
            return "Flight: " +
                      from + " -> " + stopover + " -> " +
                      destination + " \n";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightNumber != flight.flightNumber) return false;
        if (from != null ? !from.equals(flight.from) : flight.from != null) return false;
        if (destination != null ? !destination.equals(flight.destination) : flight.destination != null) return false;
        return stopover != null ? stopover.equals(flight.stopover) : flight.stopover == null;
    }

    @Override
    public int hashCode() {
        int result = from != null ? from.hashCode() : 0;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (stopover != null ? stopover.hashCode() : 0);
        result = 31 * result + flightNumber;
        return result;
    }
}
