package com.company.BookingAll;

import java.util.Scanner;

public class BookingNumberThePlace {

    public int bookedThePlace(){
        System.out.print("Select available place for you : ");
        Scanner scanner3 = new Scanner(System.in);
        int sca = scanner3.nextInt();
        if (sca<=80&&sca>0){
            int bookedPlace = sca;
            System.out.println("Your place is booking");
        }else{
            System.out.println("Please enter the correct number!");
            return bookedThePlace();
        }return 1;
    }

}
