package lab8.ex4.ex2;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        return (int) (left.getRating() - right.getRating());
    }
}
