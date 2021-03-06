package com.kodilla.good.patterns.flightCompany;


import java.util.*;
import java.util.stream.Collectors;

public class Search {

    public void searchTo (List<Connection> flightList, City cityName) {
        flightList.stream()
                .filter(flight -> flight.getTo().equals(cityName))
                .forEach(System.out::println);
    }


    public void searchFrom(List<Connection> flightList, City cityName) {

        flightList.stream()
                .filter(flight -> flight.getFrom().equals(cityName))
                .forEach(System.out::println);
    }

    public void searchStopAndTo(List<Connection> flightList, City cityNameFrom, City cityNameTo) {

        Set<Connection> resultListFrom =
                flightList.stream()
                        .filter(flight -> flight.getFrom().equals(cityNameFrom))
                        .collect(Collectors.toSet());

        Set<Connection> resultListTo =
                flightList.stream()
                        .filter(flight -> flight.getTo().equals(cityNameTo))
                        .collect(Collectors.toSet());

        boolean end = false;

        for (Connection flight1 : resultListFrom) {
            for (Connection flight2 : resultListTo) {
                for (Connection flight3 : flightList) {
                    if (flight1.getTo().equals(flight2.getFrom()) && !end) {
                        System.out.println(flight1);
                        System.out.println(flight2);
                        end = true;
                    } else if (flight1.getTo().equals(flight3.getFrom()) && flight2.getFrom().equals(flight3.getTo()) && !end) {
                        System.out.println(flight1);
                        System.out.println(flight3);
                        System.out.println(flight2);
                        end = true;
                    }
                }
            }
        }
    }
}
