package Lab6;

import java.util.List;

//1) Визначити, чи є актор, який не зіграв в жодному фільмі
//2) Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор
//3) Знайти фільм з найбільшою  кількістю акторів

public class Main {
    public static void main(String[] args) {
        Film batman = new Film("Batman dark knight");
        Film seven = new Film("Seven");
        Film spiderMan = new Film("Spider-Man: No Way Home");

        Actor willemDafoe = new Actor("Willem Dafoe");
        Actor christianBalle = new Actor("Christian Bale");
        Actor andrewGarfield = new Actor("Andrew Garfield");
        Actor heathLedger = new Actor("Heath Ledger");
        Actor morganFreeman = new Actor("Morgan Freeman");
        Actor bradPitt = new Actor("Brad Pitt");
        Actor leoDiCaprio = new Actor("Leonardo DiCaprio");
        Actor tobeyMaguire = new Actor("Tobey Maguire");
        Actor robertPattinson = new Actor("Robert Pattinson");

        batman.addActor(heathLedger);
        batman.addActor(christianBalle);

        seven.addActor(bradPitt);
        seven.addActor(morganFreeman);

        spiderMan.addActor(willemDafoe);
        spiderMan.addActor(andrewGarfield);
        spiderMan.addActor(tobeyMaguire);

        List<Actor> batmanActors = batman.getActors();
        System.out.println("Film: Batman Dark Knight");
        for (Actor actor : batmanActors) {
            System.out.println("Actor: " + actor.getName());
        }

        System.out.println("Film: Seven");
        List<Actor> sevenActors = seven.getActors();
        for (Actor actor : sevenActors) {
            System.out.println("Actor: " + actor.getName());
        }

        System.out.println("Film: Spider-Man No Way Home");
        List<Actor> spiderManActors = spiderMan.getActors();
        for (Actor actor : spiderManActors) {
            System.out.println("Actor: " + actor.getName());
        }



        MovieDataBase db = new MovieDataBase();
        db.addFilm(batman);
        db.addFilm(seven);
        db.addFilm(spiderMan);

        db.addActor(willemDafoe);
        db.addActor(christianBalle);
        db.addActor(andrewGarfield);
        db.addActor(heathLedger);
        db.addActor(morganFreeman);
        db.addActor(bradPitt);
        db.addActor(leoDiCaprio);
        db.addActor(robertPattinson);
        db.addActor(tobeyMaguire);

        System.out.println("Чи є актор який не зіграв в жодному фільмі? " + db.isActorWithoutFilm());
        if (db.isActorWithoutFilm()) {
            List<Actor> actorsWithoutFilm = db.getActorWithoutFilm();
            System.out.print("Актори без фільму: ");
            for (int i = 0; i < actorsWithoutFilm.size(); i++) {
                Actor actor = actorsWithoutFilm.get(i);
                System.out.print(actor.getName());
                if (i < actorsWithoutFilm.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();

        List<Actor> coActors = db.getCoActors(christianBalle);
        System.out.print("Актори з якими грав Christian Bale: ");
        for (int i = 0; i < coActors.size(); i++) {
            Actor actor = coActors.get(i);
            System.out.print(actor.getName());
            if (i < coActors.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        }
        System.out.println("Фільм з найбільшою кількістю акторів: " + db.getFilmWithMostActors().getTitle());
        System.out.println();
    }
}


