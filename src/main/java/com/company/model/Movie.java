package com.company.model;

import java.time.LocalDate;

public class Movie {

    public String nameMovie;
    public Hall numberHall;
    public String typeOfMovie;//(original or translated)
    public String stateOfMovie;//pre-premier, premier or available
    public double duration;
    public LocalDate startDate;
    public LocalDate finishDate;
    public double ticketPrice;
    public String category;

    public Movie(String nameMovie, Hall numberHall, String typeOfMovie, String stateOfMovie, double duration, LocalDate startDate, LocalDate finishDate, double ticketPrice, String category) {
        this.nameMovie = nameMovie;
        this.numberHall = numberHall;
        this.typeOfMovie = typeOfMovie;
        this.stateOfMovie = stateOfMovie;
        this.duration = duration;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.ticketPrice = ticketPrice;
        this.category = category;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public Hall getNumberHall() {
        return numberHall;
    }

    public void setNumberHall(Hall numberHall) {
        this.numberHall = numberHall;
    }

    public String getTypeOfMovie() {
        return typeOfMovie;
    }

    public void setTypeOfMovie(String typeOfMovie) {
        this.typeOfMovie = typeOfMovie;
    }

    public String getStateOfMovie() {
        return stateOfMovie;
    }

    public void setStateOfMovie(String stateOfMovie) {
        this.stateOfMovie = stateOfMovie;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "nameMovie='" + nameMovie + '\'' +
                ", numberHall=" + numberHall +
                ", typeOfMovie='" + typeOfMovie + '\'' +
                ", stateOfMovie='" + stateOfMovie + '\'' +
                ", duration=" + duration +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", ticketPrice=" + ticketPrice +
                ", category='" + category + '\'' +
                '}';
    }
}
