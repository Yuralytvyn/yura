package com.company;

import java.lang.reflect.Field;

public class Circus {
    public int quantityOfSeats;
    public int quantityOfPerformanceInTheYear;
    public String address;
    protected int  amountOfPersonal;
    protected int amountOfAnimals;
    private static int costOfTickets;
    private String nameOfCircus;

    public void setCostOfTickets(int costOfTickets) {
        this.costOfTickets = costOfTickets;
    }
    public void setNameOfCircus(String nameOfCircus){
        this.nameOfCircus=nameOfCircus;
    }

    int getCostOfTickets()
   { return costOfTickets; }

    String getNameOfCircus()
    {return nameOfCircus; }

    public Circus (String address,int costOfTickets,int quantityOfSeats,int quantityOfPerformanceInTheYear, int amountOfAnimals, int amountOfPersonal, String nameOfCircus) {
        this.address = address;
        this.costOfTickets = costOfTickets;
        this.quantityOfSeats=quantityOfSeats;
        this.quantityOfPerformanceInTheYear=quantityOfPerformanceInTheYear;
        this.amountOfAnimals=amountOfAnimals;
        this.amountOfPersonal=amountOfPersonal;
        this.nameOfCircus=nameOfCircus;
    }

    public Circus (int costOfTickets){
        quantityOfSeats=100;
        quantityOfPerformanceInTheYear=5;
        address=" Volodymyra Velukogo 148";
        amountOfPersonal=40;
        amountOfAnimals=5;
        this.setCostOfTickets(costOfTickets);
        nameOfCircus = " Acrobatic circus ";
    }

    public Circus(){
       quantityOfSeats=100;
        quantityOfPerformanceInTheYear=5;
        address=" Volodymyra Velukogo 148";
        amountOfPersonal=40;
        amountOfAnimals=5;
        costOfTickets = 30;
        nameOfCircus = " Acrobatic circus ";
    }

    public String toString(){
        return "quantity of seats is " + this.quantityOfSeats+ "\n"+
                " quantity of performance per year is  " +
                this.quantityOfPerformanceInTheYear + "\n"+
                " address is" + this.address + "\n"+
                " quantity of personal is " +  this.amountOfPersonal+
                " amount of animals is " + this.amountOfAnimals+ "\n"+
                " cost of tickets is " +  this.getCostOfTickets()+
                " name of circus is " + "\n"+ this.getNameOfCircus();
    }

    public void resetValuess(int quantityOfSeats, int quantityOfPerformanceInTheYear, String address, int  amountOfPersonal, int amountOfAnimals, int costOfTickets, String nameOfCircus){
        this.address = address;
        this.costOfTickets = costOfTickets;
        this.quantityOfSeats=quantityOfSeats;
        this.quantityOfPerformanceInTheYear=quantityOfPerformanceInTheYear;
        this.amountOfAnimals=amountOfAnimals;
        this.amountOfPersonal=amountOfPersonal;
        this.nameOfCircus=nameOfCircus;
    }

    public static int printStaticField(){
        return costOfTickets;
    }
}