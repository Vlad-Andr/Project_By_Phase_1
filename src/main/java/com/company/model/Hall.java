package com.company.model;

public class Hall {

    private int numberHall;
    private int amountOfPlaces;
    private String typeOfPlace;//normal, premium or vip

    public Hall(int numberHall, int amountOfPlaces, String typeOfPlace) {
        this.numberHall = numberHall;
        this.amountOfPlaces = amountOfPlaces;
        this.typeOfPlace = typeOfPlace;
    }

    public int getNumberHall() {
        return numberHall;
    }

    public void setNumberHall(int numberHall) {
        this.numberHall = numberHall;
    }

    public int getAmountOfPlaces() {
        return amountOfPlaces;
    }

    public void setAmountOfPlaces(int amountOfPlaces) {
        this.amountOfPlaces = amountOfPlaces;
    }

    public String getTypeOfPlace() {
        return typeOfPlace;
    }

    public void setTypeOfPlace(String typeOfPlace) {
        this.typeOfPlace = typeOfPlace;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "numberHall=" + numberHall +
                ", amountOfPlaces=" + amountOfPlaces +
                ", typeOfPlace='" + typeOfPlace + '\'' +
                '}';
    }
}
