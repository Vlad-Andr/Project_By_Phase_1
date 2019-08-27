package com.company.relise;

import com.company.model.Client;
import com.company.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.company.usinglist.MovieList.createFirstMovieList;
import static com.company.usinglist.MovieList.createSecondMovieList;

public class TicketRelise {
    ReliseAllList reliseAllList = new ReliseAllList();
    RagisterList ragisterList = new RagisterList();
    public List<Map<String, List<Movie>>> bookingMoviesList = new ArrayList<Map<String, List<Movie>>>();

    public void ticket() {
        ragisterList.appRegister();
        CommandList.selectNextExecuting();
        reliseAllList.relise();
        bookingMoviesList.add(reliseAllList.bookingMovieList.get(0));
        System.out.println("------------------------------------------------------");
        System.out.println("Your ticket : ");
        System.out.println("Your name : " + ragisterList.clients.get(0).getNameClient() + " " + ragisterList.clients.get(0).getSurNameClient() + "\n");
        System.out.println("Your movie : " + bookingMoviesList.get(0) + "\n");
        System.out.println("Your amount place is : " + reliseAllList.getScanPlace() + "\n");
        switch (reliseAllList.getScanNameMovie()) {
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

