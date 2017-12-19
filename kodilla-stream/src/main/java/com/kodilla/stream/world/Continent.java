package com.kodilla.stream.world;

import java.util.ArrayList;

public class Continent {

    private final String continentName;
    private final ArrayList <Country> countriesList;

    public Continent(String continentName, ArrayList<Country> countriesList) {
        this.continentName = continentName;
        this.countriesList = countriesList;
    }

    public String getContinentName() {
        return continentName;
    }

    public ArrayList<Country> getCountriesList() {
        return countriesList;
    }

    public void addToCountriesList(Country country) {

        countriesList.add(country);
    }
}
