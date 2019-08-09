package com.company.usinglist;
import com.company.model.Cinema;
import com.company.model.Movie;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.company.usinglist.MovieList.*;


public class CinemaList {

        final List<Cinema> cinemas1 = createFirstCinemaList();
        final List<Cinema> cinemas2 = createSecondCinemaList();

        public void cinemasAndMovieList() {
                Map<String, List<List<Movie>>> groupByCinema = Stream.concat(cinemas1.stream(), cinemas2.stream())
                        .collect(Collectors.groupingBy(Cinema::getNameCinema, Collectors.mapping(Cinema::getMovies, Collectors.toList())));

                System.out.println(groupByCinema);
        }

        public void filterByRating() {
                System.out.println("Enter the lowest acceptable rating : ");
                Scanner scanner = new Scanner(System.in);
                Double scan = scanner.nextDouble();
                Map<String, List<Double>> groupByRating = Stream.concat(cinemas1.stream(), cinemas2.stream())
                        .filter(cinema -> (cinema.getRating() >= scan))
                        .collect(Collectors.groupingBy(Cinema::getNameCinema, Collectors.mapping(Cinema::getRating, Collectors.toList())));

                System.out.println("The most suitable cinema for you : \n" + groupByRating);
        }


       public void filterByCategory1() {
                System.out.println("Enter the desirable movie category : \n");
                Scanner scanner1 = new Scanner(System.in);
                String  s = scanner1.nextLine();
               System.out.println("\nEnter the type of place you would like (VIP, normal, premium) : \n");
               Scanner scanner2 = new Scanner(System.in);
               String  sc = scanner2.nextLine();
                Map<String, List<Movie>> groupByCategory = createFirstMovieList().stream()
                        .filter(movies -> (movies.getCategory().equals(s)&&(movies.getNumberHall().getTypeOfPlace().equals(sc))))
                        .collect(Collectors.groupingBy(Movie::getNameMovie));

                System.out.println(groupByCategory);
        }


        public void filterByCategory2() {
                System.out.println("Enter the desirable movie category : \n");
                Scanner scanner = new Scanner(System.in);
                String  s = scanner.nextLine();
                System.out.println("\nEnter the type of place you would like (VIP, normal, premium) : \n");
                Scanner scan = new Scanner(System.in);
                String  sc = scan.nextLine();
                Map<String, List<Movie>> groupByCategoryAndType = createSecondMovieList().stream()
                        .filter(movies -> (movies.getCategory().equals(s))&&(movies.getNumberHall().getTypeOfPlace().equals(sc)))
                        .collect(Collectors.groupingBy(Movie::getNameMovie));

                System.out.println(groupByCategoryAndType);

        }

        public String selectCinema() {
                System.out.println("Enter name of cinema if you want to go : ");
                Scanner scanner = new Scanner(System.in);
                String scan = scanner.nextLine();
                if (scan.equals("GrandPhoenix")) {
                        Map<String, List<List<Movie>>> groupByCinema = cinemas1.stream()
                                .collect(Collectors.groupingBy(Cinema::getNameCinema, Collectors.mapping(Cinema::getMovies, Collectors.toList())));
                        System.out.println(groupByCinema);
                        filterByCategory1();
                } else if (scan.equals("SilverOrigin")) {
                        Map<String, List<List<Movie>>> groupByCinema = cinemas2.stream()
                                .collect(Collectors.groupingBy(Cinema::getNameCinema, Collectors.mapping(Cinema::getMovies, Collectors.toList())));
                        System.out.println(groupByCinema);
                        filterByCategory2();
                } else {
                        System.out.println("Please enter the correct name of cinema!");
                        return selectCinema();
                }return "Good!";
        }

        public List<Cinema> createFirstCinemaList() {
                List<Cinema> cinema1 = new ArrayList<>();
                cinema1.add(new Cinema("\nGrandPhoenix\n", "Kiev", 8.5, createFirstMovieList()));
                return cinema1;
        }
        public List<Cinema> createSecondCinemaList() {
                List<Cinema> cinema2 = new ArrayList<>();
                cinema2.add(new Cinema("\nSilverOrigin\n", "Odessa", 6.2, createSecondMovieList()));
                return cinema2;
        }
}