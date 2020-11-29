package com.kodilla.good.patterns.flightCompany;

import java.util.*;

public class CityList {
    
    List<City> cityList = new ArrayList<>();
    
    public CityList () {
        cityList.add(new City("Warszawa"));
        cityList.add(new City("Poznań"));
        cityList.add(new City("Kraków"));
        cityList.add(new City("Gdańsk"));
        cityList.add(new City("Wrocław"));
        cityList.add(new City("Bydgoszcz"));
    }
}
