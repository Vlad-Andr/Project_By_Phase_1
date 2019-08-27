package com.company.relise;

import com.company.model.Client;
import com.company.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SelectAllInfoByClient {
    ScanMovieAndPlace scanMovieAndPlace = new ScanMovieAndPlace();
    RagisterList ragisterList = new RagisterList();
    public List<Map<String, List<Movie>>> bookingMoviesList = new ArrayList<Map<String, List<Movie>>>();
    public List<Client> clients = new ArrayList<>();

    public void selectInfoByClient() {
        ragisterList.appRegister();
        CommandList.selectNextExecuting();
        scanMovieAndPlace.setMovieAndPlace();
        clients.add(0, ragisterList.clients.get(0));
        bookingMoviesList.add(scanMovieAndPlace.bookingMovieList.get(0));
        System.out.println("------------------------------------------------------");
        System.out.println("Your ticket : ");
        System.out.println("Your name : " + ragisterList.clients.get(0).getNameClient() + " " + ragisterList.clients.get(0).getSurNameClient() + "\n");
        System.out.println("Your movie : " + bookingMoviesList.get(0) + "\n");
        System.out.println("Your amount place is : " + scanMovieAndPlace.getScanPlace() + "\n");
    }
}
