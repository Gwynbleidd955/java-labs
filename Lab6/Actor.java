package Lab6;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String name;

    List<Film> films = new ArrayList<>();

    List<Film> getFilms() {
        return films;
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public Actor(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
