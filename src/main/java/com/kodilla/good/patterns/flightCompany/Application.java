package com.kodilla.good.patterns.flightCompany;

public class Application {
    public static void main (String[] args){

        FlightRepository repository = new FlightRepository();
        Search search = new Search();

        search.searchTo(repository.connectionList, repository.warszawa);
        System.out.println();
        search.searchFrom(repository.connectionList, repository.krakow);
        System.out.println();
        search.searchStopAndTo(repository.connectionList, repository.wroclaw, repository.bydgoszcz);
    }
}
