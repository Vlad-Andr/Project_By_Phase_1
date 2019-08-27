package com.company.usinglist;

import com.company.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovieList {
    public static List<Movie> createFirstMovieList() {
        List<Movie> movies1 = new ArrayList<>();
        movies1.add(new Movie("Lara Croft", HallList.createHallList().get(0), "translate", "available", 140, LocalDate.of(2019, 3, 29), LocalDate.of(2019, 9, 15), 125.0, "action"));
        movies1.add(new Movie("Godzilla 2", HallList.createHallList().get(1), "translate", "premier", 115, LocalDate.of(2019, 4, 17), LocalDate.of(2019, 9, 12), 90.0, "fantasy"));
        movies1.add(new Movie("Shaft", HallList.createHallList().get(2), "original", "pre-premier", 120, LocalDate.of(2019, 6, 11), LocalDate.of(2019, 9, 24), 105.5, "detective"));
        movies1.add(new Movie("Lord of the Rings", HallList.createHallList().get(3), "original", "available", 90, LocalDate.of(2019, 6, 28), LocalDate.of(2019, 9, 20), 130.0, "fantasy"));
        movies1.add(new Movie("John Weak 3", HallList.createHallList().get(4), "original", "pre-premier", 135, LocalDate.of(2019, 1, 19), LocalDate.of(2019, 9, 18), 110.0, "action"));
        return movies1;
    }

    public static List<Movie> createSecondMovieList() {
        List<Movie> movies2 = new ArrayList<>();
        movies2.add(new Movie("Taxi 5", HallList.createHallList().get(0), "original", "available", 150, LocalDate.of(2019, 4, 21), LocalDate.of(2019, 9, 20), 145.0, "action"));
        movies2.add(new Movie("Hancock", HallList.createHallList().get(1), "translate", "premier", 125, LocalDate.of(2019, 2, 16), LocalDate.of(2019, 9, 8), 100.0, "heroic"));
        movies2.add(new Movie("King Lion", HallList.createHallList().get(2), "original", "pre-premier", 85, LocalDate.of(2019, 5, 4), LocalDate.of(2019, 9, 14), 95.0, "fantasy"));
        movies2.add(new Movie("MIB", HallList.createHallList().get(3), "translate", "premier", 110, LocalDate.of(2019, 2, 15), LocalDate.of(2019, 9, 10), 85.0, "fantasy"));
        movies2.add(new Movie("Inception", HallList.createHallList().get(4), "translate", "available", 95, LocalDate.of(2019, 5, 24), LocalDate.of(2019, 9, 12), 115.0, "fantasy"));
        return movies2;
    }
}


