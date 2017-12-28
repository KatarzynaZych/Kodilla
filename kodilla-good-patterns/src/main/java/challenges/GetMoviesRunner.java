package challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetMoviesRunner {

    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

        String cos = movieStore.getMovies().entrySet()
                .stream()
                .map(e -> e.getValue())
                .map(m -> m.get(m.size() - m.size()) +"!"+ m.get(m.size() - 1))
                .collect(Collectors.joining("!", "!", "!"));

        System.out.println(cos);
                

    }
}
