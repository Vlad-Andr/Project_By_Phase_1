package com.company;
import com.company.model.Client;
import com.company.model.Movie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.company.usinglist.MovieList.createFirstMovieList;
import static com.company.usinglist.MovieList.createSecondMovieList;

public class BookingList {
    public static void AppRelise(){
            List<Client> clients = new ArrayList<>();
            try {
                System.out.println("You must register!\n");

                System.out.println("Enter your name : ");
                Scanner scanner1 = new Scanner(System.in);
                String s1 = scanner1.nextLine();
                System.out.println("Enter your surname : ");
                Scanner scanner2 = new Scanner(System.in);
                String s2 = scanner2.nextLine();
                System.out.println("Enter your age : ");
                Scanner scanner3 = new Scanner(System.in);
                int s3 = scanner3.nextInt();
                System.out.println("Enter your eMail : ");
                Scanner scanner4 = new Scanner(System.in);
                String s4 = scanner4.nextLine();
                System.out.println("Enter your phoneNumber : ");
                Scanner scanner5 = new Scanner(System.in);
                String s5 = scanner5.nextLine();
                System.out.println("You are student? (true/false) : ");
                Scanner scanner6 = new Scanner(System.in);
                boolean s6 = scanner6.nextBoolean();

                clients.add(new Client(s1, s2, s3, s4, s5, s6));
                //System.out.println(clients);

            } catch (ConcurrentModificationException e) {
                System.out.println("Error" + e);

        }

        CommandList.commandPrint();
        System.out.println("Enter the name of movie if you want to watch : \n");
        Scanner scanner = new Scanner(System.in);
        String  scan = scanner.nextLine();
        Map<String, List<Movie>> bookingMovie = Stream.concat(createSecondMovieList().stream(),createFirstMovieList().stream())
                .filter(movies -> (movies.getNameMovie().equals(scan)))
                .collect(Collectors.groupingBy(Movie::getNameMovie));

        System.out.println(bookingMovie + "\n is booking! \n");

        System.out.print("Select available place for you : ");
        Scanner scanner3 = new Scanner(System.in);
        int sca = scanner3.nextInt();
        if (sca<=80&&sca>0){
            System.out.println("Your place is booking");
        }else{
            System.out.println("Please enter the correct number!");
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Your ticket : ");
        System.out.println("Your name : " + clients.get(0).getNameClient() + " " + clients.get(0).getSurNameClient() + "\n");

        System.out.println("Your movie : " + bookingMovie.values() + "\n");

        System.out.println("Your amount place is : " + sca + "\n");

switch (scan){
    case "Taxi 5":
        if (clients.get(0).isStatusStudent()){
            System.out.println("Price for ticket : " + (createSecondMovieList().get(0).getTicketPrice()-createSecondMovieList().get(0).getTicketPrice()*0.10*0.15));}
        else System.out.println("Price for ticket : " + (createSecondMovieList().get(0).getTicketPrice()-createSecondMovieList().get(0).getTicketPrice()*0.15));
        break;
    case "Hancock":
        if (clients.get(0).isStatusStudent()){
            System.out.println("Price for ticket : " + (createSecondMovieList().get(1).getTicketPrice()-createSecondMovieList().get(1).getTicketPrice()*0.10*0.07));}
        else System.out.println("Price for ticket : " + (createSecondMovieList().get(1).getTicketPrice()-createSecondMovieList().get(1).getTicketPrice()*0.07));
        break;
    case "King Lion":
        System.out.println("Price for ticket : " + createSecondMovieList().get(2).getTicketPrice());
        break;
    case "MIB":
        if (clients.get(0).isStatusStudent()){
            System.out.println("Price for ticket : " + (createSecondMovieList().get(3).getTicketPrice()-createSecondMovieList().get(3).getTicketPrice()*0.10*0.07));}
        else System.out.println("Price for ticket : " + (createSecondMovieList().get(3).getTicketPrice()-createSecondMovieList().get(3).getTicketPrice()*0.07));
        break;
    case "Inception":
        if (clients.get(0).isStatusStudent()){
            System.out.println("Price for ticket : " + (createSecondMovieList().get(4).getTicketPrice()-createSecondMovieList().get(4).getTicketPrice()*0.10*0.15));}
        else System.out.println("Price for ticket : " + (createSecondMovieList().get(4).getTicketPrice()-createSecondMovieList().get(4).getTicketPrice()*0.15));
        break;
    case "Lara Croft":
        if (clients.get(0).isStatusStudent()){
            System.out.println("Price for ticket : " + (createFirstMovieList().get(0).getTicketPrice()-createFirstMovieList().get(0).getTicketPrice()*0.10*0.15));}
        else System.out.println("Price for ticket : " + (createFirstMovieList().get(0).getTicketPrice()-createFirstMovieList().get(0).getTicketPrice()*0.15));
        break;
    case "Godzilla 2":
        if (clients.get(0).isStatusStudent()){
            System.out.println("Price for ticket : " + (createFirstMovieList().get(1).getTicketPrice()-createFirstMovieList().get(1).getTicketPrice()*0.10*0.15));}
        else System.out.println("Price for ticket : " + (createFirstMovieList().get(1).getTicketPrice()-createFirstMovieList().get(1).getTicketPrice()*0.15));
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
