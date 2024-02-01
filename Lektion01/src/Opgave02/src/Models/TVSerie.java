package Models;

import java.util.ArrayList;
import java.util.Arrays;

public class TVSerie {
    private String title;
    private int numberOfSeasons;
    private Genre[] genres;
    private ArrayList<Actor> cast;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
        this.genres = genres;
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "TVSerie{" +
                "title='" + title + '\'' +
                ", numberOfSeasons=" + numberOfSeasons +
                ", genres=" + Arrays.toString(genres) +
                ", cast=" + cast +
                '}';
    }
}
