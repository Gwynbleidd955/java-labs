package Lab6;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private String title;
    private List<Actor> actors = new ArrayList<>();

    public String getTitle() {
        return title;
    }
    public List<Actor> getActors() {
        return actors;
    }
     public Film(String title) {
        this.title = title;
    }
    public void addActor (Actor actor) {
        actors.add(actor);
        actor.addFilm(this);
    }
}
