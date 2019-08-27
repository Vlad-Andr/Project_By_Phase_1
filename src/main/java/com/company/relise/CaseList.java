package com.company.relise;

import static com.company.usinglist.MovieList.createFirstMovieList;
import static com.company.usinglist.MovieList.createSecondMovieList;

public class CaseList {
    TicketRelise ticketRelise = new TicketRelise();

    public void getTaxi() {

        if (ticketRelise.clients.get(0).isStatusStudent()) {
            System.out.println("Price for ticket : " + (createSecondMovieList().get(0).getTicketPrice() - createSecondMovieList().get(0).getTicketPrice() * 0.10 * 0.15));
        } else
            System.out.println("Price for ticket : " + (createSecondMovieList().get(0).getTicketPrice() - createSecondMovieList().get(0).getTicketPrice() * 0.15));
    }

    public void getHancock() {
        if (ticketRelise.clients.get(0).isStatusStudent()) {
            System.out.println("Price for ticket : " + (createSecondMovieList().get(1).getTicketPrice() - createSecondMovieList().get(1).getTicketPrice() * 0.10 * 0.07));
        } else
            System.out.println("Price for ticket : " + (createSecondMovieList().get(1).getTicketPrice() - createSecondMovieList().get(1).getTicketPrice() * 0.07));
    }

    public void getMIB() {
        if (ticketRelise.clients.get(0).isStatusStudent()) {
            System.out.println("Price for ticket : " + (createSecondMovieList().get(3).getTicketPrice() - createSecondMovieList().get(3).getTicketPrice() * 0.10 * 0.07));
        } else
            System.out.println("Price for ticket : " + (createSecondMovieList().get(3).getTicketPrice() - createSecondMovieList().get(3).getTicketPrice() * 0.07));
    }

    public void getInception() {
        if (ticketRelise.clients.get(0).isStatusStudent()) {
            System.out.println("Price for ticket : " + (createSecondMovieList().get(4).getTicketPrice() - createSecondMovieList().get(4).getTicketPrice() * 0.10 * 0.15));
        } else
            System.out.println("Price for ticket : " + (createSecondMovieList().get(4).getTicketPrice() - createSecondMovieList().get(4).getTicketPrice() * 0.15));
    }

    public void getLaraCroft() {
        if (ticketRelise.clients.get(0).isStatusStudent()) {
            System.out.println("Price for ticket : " + (createFirstMovieList().get(0).getTicketPrice() - createFirstMovieList().get(0).getTicketPrice() * 0.10 * 0.15));
        } else
            System.out.println("Price for ticket : " + (createFirstMovieList().get(0).getTicketPrice() - createFirstMovieList().get(0).getTicketPrice() * 0.15));
    }

    public void getGodzilla2() {
        if (ticketRelise.clients.get(0).isStatusStudent()) {
            System.out.println("Price for ticket : " + (createFirstMovieList().get(1).getTicketPrice() - createFirstMovieList().get(1).getTicketPrice() * 0.10 * 0.15));
        } else
            System.out.println("Price for ticket : " + (createFirstMovieList().get(1).getTicketPrice() - createFirstMovieList().get(1).getTicketPrice() * 0.15));
    }

    public void getShaft() {
        System.out.println("Price for ticket : " + createFirstMovieList().get(2).getTicketPrice());
    }

    public void getLords() {
        System.out.println("Price for ticket : " + createFirstMovieList().get(3).getTicketPrice());
    }

    public void getJohnWeak3() {
        System.out.println("Price for ticket : " + createFirstMovieList().get(4).getTicketPrice());
    }
}
