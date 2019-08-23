package com.company.relise;

import com.company.model.Client;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Scanner;

public class RagisterList {
    List<Client> clients = new ArrayList<>();

    public void appRegister() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("You must register!\n");
            System.out.println("Enter your name : ");
            String s1 = scanner.nextLine();
            System.out.println("Enter your surname : ");
            String s2 = scanner.nextLine();
            System.out.println("Enter your eMail : ");
            String s4 = scanner.nextLine();
            System.out.println("Enter your phoneNumber : ");
            String s5 = scanner.nextLine();
            System.out.println("You are student? (true/false) : ");
            boolean s6 = scanner.nextBoolean();
            System.out.println("Enter your age : ");
            int s3 = scanner.nextInt();

            clients.add(0,new Client(s1, s2, s3, s4, s5, s6));
        } catch (ConcurrentModificationException e) {
            System.out.println("Error" + e);
        }
    }
}
