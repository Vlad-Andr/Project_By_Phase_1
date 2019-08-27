package com.company.relise;

public class TicketRelise {
    ScanMovieAndPlace scanMovieAndPlace = new ScanMovieAndPlace();
    SelectTicketPriceList selectTicketPriceList = new SelectTicketPriceList();
    SelectAllInfoByClient select = new SelectAllInfoByClient();

    public void createTicket() {
        select.selectInfoByClient();
        switch (scanMovieAndPlace.getScanNameMovie()) {
            case "Taxi 5":
                selectTicketPriceList.getTaxi();
                break;
            case "Hancock":
                selectTicketPriceList.getHancock();
                break;
            case "MIB":
                selectTicketPriceList.getMIB();
                break;
            case "Inception":
                selectTicketPriceList.getInception();
                break;
            case "Lara Croft":
                selectTicketPriceList.getLaraCroft();
                break;
            case "Godzilla 2":
                selectTicketPriceList.getGodzilla2();
                break;
            case "Shaft":
                selectTicketPriceList.getShaft();
                break;
            case "Lord of the Rings":
                selectTicketPriceList.getLords();
                break;
            case "John Weak 3":
                selectTicketPriceList.getJohnWeak3();
                break;
        }
        System.out.println("------------------------------------------------------");
    }
}

