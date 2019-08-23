package com.company.bookingall;
import java.util.Scanner;

public class BookingNumberThePlace {
    Scanner scanner = new Scanner(System.in);
    int scannerPlace = scanner.nextInt();
    public int bookedThePlace(){
        System.out.print("Select available place for you : ");
        if (scannerPlace<=80&&scannerPlace>0){
            int bookedPlace = scannerPlace;
            System.out.println("Your place is booking");
        }else{
            System.out.println("Please enter the correct number!");
            return bookedThePlace();
        }return 1;
    }

}
