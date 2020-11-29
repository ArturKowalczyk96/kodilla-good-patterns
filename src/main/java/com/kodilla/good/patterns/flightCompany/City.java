package com.kodilla.good.patterns.flightCompany;

public class City {

    private String city;

    public City (final String city){
        this.city = city;
    }

    @Override
    public String toString() {
        return " "+ city;
    }
}
