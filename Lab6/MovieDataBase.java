package Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MovieDataBase {
    private List<Film> films = new ArrayList<>();
    private List<Actor> actors = new ArrayList<>();

    public void addFilm(Film film) {
        films.add(film);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }


    public boolean isActorWithoutFilm() {
        for (Actor actor : actors) {
            if (actor.getFilms().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    public List<Actor> getActorWithoutFilm() {
        List<Actor> result = new ArrayList<>();
        for (Actor actor : actors) {
            if (actor.getFilms().isEmpty() ) {
                result.add(actor);
            }
        }
        return result;
    }
    public List<Actor> getCoActors(Actor target) {
        List<Actor> result = new ArrayList<>();

        Iterator filmIt = target.getFilms().iterator();
        while (filmIt.hasNext()) {
            Film film = (Film) filmIt.next();

            Iterator actorIt = film.getActors().iterator();
            while (actorIt.hasNext()) {
                Actor other = (Actor) actorIt.next();

                if (other != target && !result.contains(other)) {
                    result.add(other);
                }
            }
        }
        return result;
    }
    public Film getFilmWithMostActors () {
        Film best = null;
        Iterator <Film> it = films.iterator();
        while (it.hasNext()) {
            Film film = it.next();
            if (best == null || film.getActors().size() > best.getActors().size()) {
                best = film;
            }
        }
        return best;
    }
}
