package com.company;

import com.company.BookingAll.BookingByNameOfMovie;
import com.company.usinglist.CinemaList;

import java.util.Scanner;

public class CommandList {
    public static void commandPrint()
    {
        System.out.println("\n--List cinemas and movies going there                               -Enter 1"   );
       // System.out.println("--The list of your booking movie                                    -Enter 2"   );
        System.out.println("--exit                                                                -Enter exit\n");

        System.out.print("Enter number of command which you want used : ");

        Scanner scannerCommand = new Scanner(System.in);
        String sc = scannerCommand.nextLine();

        switch (sc) {
            case "1":
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Cinemas :");
                CinemaList cl = new CinemaList();
                cl.cinemasAndMovieList();
                System.out.println("-----------------------------------------------------------------");

                System.out.println("FILTER CINEMAS BY RATING");
                System.out.println("-----------------------------------------------------------------");
                cl.filterByRating();
                System.out.println("-----------------------------------------------------------------");

                System.out.println("\nSELECT CINEMA : \n");
                System.out.println("-----------------------------------------------------------------");
                cl.selectCinema();
                System.out.println("-----------------------------------------------------------------");
                break;
            /*case "2":
                System.out.println("Your booking movies : ");
                BookingByNameOfMovie bbn = new BookingByNameOfMovie();
                bbn.bookingByNameMovie();
                break;*/
            case "exit":
                System.out.println("Bye");
        }
    }
}
