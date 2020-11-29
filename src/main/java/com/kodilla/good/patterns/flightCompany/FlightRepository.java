package com.kodilla.good.patterns.flightCompany;

import java.util.ArrayList;

public class FlightRepository {

    City warszawa = new City("Warszawa");
    City poznan = new City("Poznań");
    City krakow = new City("Kraków");
    City gdansk = new City("Gdańsk");
    City wroclaw = new City("Wrocław");
    City bydgoszcz = new City("Bydgoszcz");

    ArrayList<Connection> connectionList = new ArrayList<>();

    public FlightRepository(){
        connectionList.add(new Connection(warszawa, poznan));
        connectionList.add(new Connection(poznan, warszawa));
        connectionList.add(new Connection(warszawa, krakow));
        connectionList.add(new Connection(krakow, warszawa));
        connectionList.add(new Connection(warszawa, gdansk));
        connectionList.add(new Connection(gdansk, warszawa));
        connectionList.add(new Connection(warszawa, bydgoszcz));
        connectionList.add(new Connection(bydgoszcz, warszawa));
        connectionList.add(new Connection(wroclaw, krakow));
        connectionList.add(new Connection(krakow, wroclaw));
        connectionList.add(new Connection(wroclaw, gdansk));
        connectionList.add(new Connection(gdansk, wroclaw));
        connectionList.add(new Connection(gdansk, poznan));
        connectionList.add(new Connection(poznan, gdansk));
        connectionList.add(new Connection(krakow, gdansk));
        connectionList.add(new Connection(gdansk, krakow));
    }
}
