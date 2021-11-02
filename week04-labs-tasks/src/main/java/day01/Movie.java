package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private final String title;
    private final int releaseYear;
    List<Actor> actors = new ArrayList<>();

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int getNumberOfActorsInTheirTwenties() {
        int result = 0;
        for (Actor actor : actors) {
            int age = releaseYear - actor.getYearOfBirth();
            if (age >= 20 && age < 30) result++;
        }
        return result;
    }
}
