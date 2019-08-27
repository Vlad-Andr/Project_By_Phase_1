package com.company.relise;

import com.company.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.company.usinglist.MovieList.createFirstMovieList;
import static com.company.usinglist.MovieList.createSecondMovieList;

public class ScanMovieAndPlace {
    public List<Map<String, List<Movie>>> bookingMovieList = new ArrayList<Map<String, List<Movie>>>();
    Scanner scanner = new Scanner(System.in);
    private String scanNameMovie;
    private int scanPlace;

    public void setMovieAndPlace() {
        System.out.println("Enter the name of movie if you want to watch : \n");
        scanNameMovie = scanner.nextLine();
        Map<String, List<Movie>> bookingMovie = Stream.concat(createSecondMovieList().stream(), createFirstMovieList().stream())
                .filter(movies -> (movies.getNameMovie().equals(scanNameMovie)))
                .collect(Collectors.groupingBy(Movie::getNameMovie));
        System.out.println(bookingMovie + "\n is booking! \n");
        bookingMovieList.add(0, bookingMovie);

        System.out.print("Select available place for you : ");
        scanPlace = scanner.nextInt();
        if (scanPlace <= 80 && scanPlace > 0) {
            System.out.println("Your place is booking");
        } else {
            System.out.println("Please enter the correct number!");
        }
    }

    public String getScanNameMovie() {
        return scanNameMovie;
    }

    public int getScanPlace() {
        return scanPlace;
    }
}