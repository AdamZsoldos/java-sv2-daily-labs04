package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    @Test
    void getNumberOfActorsInTheirTwentiesTest() {
        Movie movie = new Movie("The Thing", 1982);
        movie.addActor(new Actor("Kurt Russell", 1951));
        movie.addActor(new Actor("Wilford Brimley", 1934));
        movie.addActor(new Actor("Keith David", 1956));
        movie.addActor(new Actor("Richard Masur", 1948));
        movie.addActor(new Actor("T.K. Carter", 1956));
        assertEquals(2, movie.getNumberOfActorsInTheirTwenties());
    }
}
