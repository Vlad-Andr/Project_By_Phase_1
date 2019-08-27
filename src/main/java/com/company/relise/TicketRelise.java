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
    CaseList caseList = new CaseList();
    public List<Map<String, List<Movie>>> bookingMoviesList = new ArrayList<Map<String, List<Movie>>>();
    public List<Client> clients = new ArrayList<>();

    public void ticket() {
        ragisterList.appRegister();
        CommandList.selectNextExecuting();
        reliseAllList.relise();
        clients.add(0, ragisterList.clients.get(0));
        bookingMoviesList.add(reliseAllList.bookingMovieList.get(0));
        System.out.println("------------------------------------------------------");
        System.out.println("Your ticket : ");
        System.out.println("Your name : " + ragisterList.clients.get(0).getNameClient() + " " + ragisterList.clients.get(0).getSurNameClient() + "\n");
        System.out.println("Your movie : " + bookingMoviesList.get(0) + "\n");
        System.out.println("Your amount place is : " + reliseAllList.getScanPlace() + "\n");
        switch (reliseAllList.getScanNameMovie()) {
            case "Taxi 5":
                caseList.getTaxi();
                break;
            case "Hancock":
                caseList.getHancock();
                break;
            case "MIB":
                caseList.getMIB();
                break;
            case "Inception":
                caseList.getInception();
                break;
            case "Lara Croft":
                caseList.getLaraCroft();
                break;
            case "Godzilla 2":
                caseList.getGodzilla2();
                break;
            case "Shaft":
                caseList.getShaft();
                break;
            case "Lord of the Rings":
                caseList.getLords();
                break;
            case "John Weak 3":
                caseList.getJohnWeak3();
                break;
        }
        System.out.println("------------------------------------------------------");
    }
}

