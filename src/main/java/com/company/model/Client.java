package com.company.model;

public class Client {

    private String nameClient;
    private String surNameClient;
    private int age;
    private String email;
    private String  phoneNumber;
    private boolean statusStudent;

    public Client(String nameClient, String surNameClient, int age, String email, String phoneNumber, boolean statusStudent) {
        this.nameClient = nameClient;
        this.surNameClient = surNameClient;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.statusStudent = statusStudent;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getSurNameClient() {
        return surNameClient;
    }

    public void setSurNameClient(String surNameClient) {
        this.surNameClient = surNameClient;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String geteMail() {
        return email;
    }

    public void seteMail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isStatusStudent() {
        return statusStudent;
    }

    public void setStatusStudent(boolean statusStudent) {
        this.statusStudent = statusStudent;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nameClient='" + nameClient + '\'' +
                ", surNameClient='" + surNameClient + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", statusStudent=" + statusStudent +
                '}';
    }
}
