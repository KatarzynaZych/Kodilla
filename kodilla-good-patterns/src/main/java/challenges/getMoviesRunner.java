package challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class getMoviesRunner {

    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> movies = movieStore.getMovies();

        Stream.of( movies)
                .flatMap(m -> m.values().stream())
                .map(i -> i.get(0) + "! \n" + i.get(1) + "!")
                .forEach(System.out::println);


    }
}
