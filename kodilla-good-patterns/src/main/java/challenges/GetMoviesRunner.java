package challenges;


import java.util.stream.Collectors;

public class GetMoviesRunner {

    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

        String moviesString = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!", "!", "!"));

        System.out.println(moviesString);

    }
}
