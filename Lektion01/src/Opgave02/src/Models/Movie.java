package Models;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    private String title;
    private int productionYear;
    private Director director;
    private Genre[] genres;
    private double rating;
    private ArrayList<Actor> cast;

    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        this.title = title;
        this.productionYear = productionYear;
        this.director = director;
        this.genres = genres;
        this.rating = rating;
        this.cast = cast;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", productionYear=" + productionYear +
                ", director=" + director +
                ", genres=" + Arrays.toString(genres) +
                ", rating=" + rating +
                ", cast=" + cast +
                '}';
    }
}
