package Storage;

import Models.Actor;
import Models.Movie;
import Models.TVSerie;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addTVSerie(TVSerie serie) {
        series.add(serie);
    }

    public ArrayList<Movie> getDirectorForMovies(String InstruktørNavn, ArrayList<Movie> filmListe) {
        ArrayList<Movie> instruktørFilm = new ArrayList<>();
        for (Movie film : filmListe) {
            if (film.getDirector().getName().equalsIgnoreCase(InstruktørNavn)) {
                instruktørFilm.add(film);
            }
        }
        return instruktørFilm;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<TVSerie> getSeries() {
        return series;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return
                "movies=" + "\n" + movies +
                ", series=" + "\n" + series +
                ", actors=" + "\n" + actors +
                '}';
    }
}
