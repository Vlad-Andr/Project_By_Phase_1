package com.company.model;

public class Client {

    private String nameClient;
    private String surNameClient;
    private int age;
    private String eMail;
    private String  phoneNumber;
    private boolean statusStudent;

    public Client(String nameClient, String surNameClient, int age, String eMail, String phoneNumber, boolean statusStudent) {
        this.nameClient = nameClient;
        this.surNameClient = surNameClient;
        this.age = age;
        this.eMail = eMail;
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
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", statusStudent=" + statusStudent +
                '}';
    }
}
