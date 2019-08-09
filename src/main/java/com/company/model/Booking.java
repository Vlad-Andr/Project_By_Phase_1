package com.company.model;

import java.time.LocalDate;
import java.util.List;

public class Booking {

    private LocalDate dateOfBooking;
    private boolean paymentStatus;//paid or unpaid
    private List<Booking> bookedMovies;
    private double amount;

    public Booking(LocalDate dateOfBooking, boolean paymentStatus, List<Booking> bookedMovies, double amount) {
        this.dateOfBooking = dateOfBooking;
        this.paymentStatus = paymentStatus;
        this.bookedMovies = bookedMovies;
        this.amount = amount;
    }

    public LocalDate getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(LocalDate dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public List<Booking> getBookedMovies() {
        return bookedMovies;
    }

    public void setBookedMovies(List<Booking> bookedMovies) {
        this.bookedMovies = bookedMovies;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "dateOfBooking=" + dateOfBooking +
                ", paymentStatus=" + paymentStatus +
                ", bookedMovies=" + bookedMovies +
                ", amount=" + amount +
                '}';
    }
}
