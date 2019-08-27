package com.company.relise;

import com.company.model.Client;
import com.company.model.Movie;
import com.company.relise.CommandList;
import com.company.relise.RagisterList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.company.usinglist.MovieList.createFirstMovieList;
import static com.company.usinglist.MovieList.createSecondMovieList;

public class ReliseAllList {
    RagisterList ragisterList = new RagisterList();
    public List<Client> clientslist = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void relise() {
        ragisterList.appRegister();
        clientslist.add(ragisterList.clients.get(0));
        CommandList.selectNextExecuting();
        System.out.println("Enter the name of movie if you want to watch : \n");
        String scanNameMovie = scanner.nextLine();
        Map<String, List<Movie>> bookingMovie = Stream.concat(createSecondMovieList().stream(), createFirstMovieList().stream())
                .filter(movies -> (movies.getNameMovie().equals(scanNameMovie)))
                .collect(Collectors.groupingBy(Movie::getNameMovie));
        System.out.println(bookingMovie + "\n is booking! \n");

        System.out.print("Select available place for you : ");
        int scanPlace = scanner.nextInt();
        if (scanPlace <= 80 && scanPlace > 0) {
            System.out.println("Your place is booking");
        } else {
            System.out.println("Please enter the correct number!");
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Your ticket : ");
        System.out.println("Your name : " + clientslist.get(0).getNameClient() + " " + clientslist.get(0).getSurNameClient() + "\n");
        System.out.println("Your movie : " + bookingMovie.values() + "\n");
        System.out.println("Your amount place is : " + scanPlace + "\n");
        switch (scanNameMovie) {
            case "Taxi 5":
                if (ragisterList.clients.get(0).isStatusStudent()) {
                    System.out.println("Price for ticket : " + (createSecondMovieList().get(0).getTicketPrice() - createSecondMovieList().get(0).getTicketPrice() * 0.10 * 0.15));
                } else
                    System.out.println("Price for ticket : " + (createSecondMovieList().get(0).getTicketPrice() - createSecondMovieList().get(0).getTicketPrice() * 0.15));
                break;
            case "Hancock":
                if (ragisterList.clients.get(0).isStatusStudent()) {
                    System.out.println("Price for ticket : " + (createSecondMovieList().get(1).getTicketPrice() - createSecondMovieList().get(1).getTicketPrice() * 0.10 * 0.07));
                } else
                    System.out.println("Price for ticket : " + (createSecondMovieList().get(1).getTicketPrice() - createSecondMovieList().get(1).getTicketPrice() * 0.07));
                break;
            case "King Lion":
                System.out.println("Price for ticket : " + createSecondMovieList().get(2).getTicketPrice());
                break;
            case "MIB":
                if (ragisterList.clients.get(0).isStatusStudent()) {
                    System.out.println("Price for ticket : " + (createSecondMovieList().get(3).getTicketPrice() - createSecondMovieList().get(3).getTicketPrice() * 0.10 * 0.07));
                } else
                    System.out.println("Price for ticket : " + (createSecondMovieList().get(3).getTicketPrice() - createSecondMovieList().get(3).getTicketPrice() * 0.07));
                break;
            case "Inception":
                if (ragisterList.clients.get(0).isStatusStudent()) {
                    System.out.println("Price for ticket : " + (createSecondMovieList().get(4).getTicketPrice() - createSecondMovieList().get(4).getTicketPrice() * 0.10 * 0.15));
                } else
                    System.out.println("Price for ticket : " + (createSecondMovieList().get(4).getTicketPrice() - createSecondMovieList().get(4).getTicketPrice() * 0.15));
                break;
            case "Lara Croft":
                if (ragisterList.clients.get(0).isStatusStudent()) {
                    System.out.println("Price for ticket : " + (createFirstMovieList().get(0).getTicketPrice() - createFirstMovieList().get(0).getTicketPrice() * 0.10 * 0.15));
                } else
                    System.out.println("Price for ticket : " + (createFirstMovieList().get(0).getTicketPrice() - createFirstMovieList().get(0).getTicketPrice() * 0.15));
                break;
            case "Godzilla 2":
                if (ragisterList.clients.get(0).isStatusStudent()) {
                    System.out.println("Price for ticket : " + (createFirstMovieList().get(1).getTicketPrice() - createFirstMovieList().get(1).getTicketPrice() * 0.10 * 0.15));
                } else
                    System.out.println("Price for ticket : " + (createFirstMovieList().get(1).getTicketPrice() - createFirstMovieList().get(1).getTicketPrice() * 0.15));
                break;
            case "Shaft":
                System.out.println("Price for ticket : " + createFirstMovieList().get(2).getTicketPrice());
                break;
            case "Lord of the Rings":
                System.out.println("Price for ticket : " + createFirstMovieList().get(3).getTicketPrice());
                break;
            case "John Weak 3":
                System.out.println("Price for ticket : " + createFirstMovieList().get(4).getTicketPrice());
                break;
        }
        System.out.println("------------------------------------------------------");
    }
}
