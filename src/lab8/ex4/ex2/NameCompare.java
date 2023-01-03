package lab8.ex4.ex2;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }

}
