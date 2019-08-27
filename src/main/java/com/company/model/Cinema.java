package com.company.model;

import java.util.List;

public class Cinema {

    private String nameCinema;
    private String addres;
    private double rating;
    private List<Movie> movies;

    public Cinema(String nameCinema, String addres, double rating, List<Movie> movies) {
        this.nameCinema = nameCinema;
        this.addres = addres;
        this.rating = rating;
        this.movies = movies;
    }

    public String getNameCinema() {
        return nameCinema;
    }

    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movieList) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "nameCinema='" + nameCinema + '\'' +
                ", addres='" + addres + '\'' +
                ", rating=" + rating +
                ", movies=" + movies +
                '}';
    }
}
