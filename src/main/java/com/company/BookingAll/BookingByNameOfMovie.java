package com.company.BookingAll;
import com.company.model.Movie;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.company.usinglist.MovieList.createSecondMovieList;
import static com.company.usinglist.MovieList.createFirstMovieList;

public class BookingByNameOfMovie {

    public void bookingByNameMovie(){
        System.out.println("Enter the name of movie if you want to watch : \n");
        Scanner scanner = new Scanner(System.in);
        String  scan = scanner.nextLine();
        Map<String, List<Movie>> bookingMovie = Stream.concat(createSecondMovieList().stream(),createFirstMovieList().stream())
                .filter(movies -> (movies.getNameMovie().equals(scan)))
                .collect(Collectors.groupingBy(Movie::getNameMovie));

        System.out.println(bookingMovie + "\n is booking! \n");
    }
}
