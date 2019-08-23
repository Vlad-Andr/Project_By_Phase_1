package com.company.relise;

import com.company.usinglist.CinemaList;

import java.util.Scanner;

public class CommandList {
    public static void selectNextExecuting()
    {
        System.out.println("\n--List cinemas and movies going there                               -Enter 1"   );
        System.out.println("--exit                                                                -Enter exit\n");

        System.out.print("Enter number of command which you want used : ");

        Scanner scannerCommand = new Scanner(System.in);
        String sc = scannerCommand.nextLine();

        switch (sc) {
            case "1":
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Cinemas :");
                CinemaList cl = new CinemaList();
                cl.groupByCinema();
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
            case "exit":
                System.out.println("Bye");
                System.exit(0);
        }
    }
}
