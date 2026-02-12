package com.example.listcity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     *
     * This adds a city to the list if the city does not already exist
     * @param city
     * This is a candidate city to add
     */

    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists");
        }
        cities.add(city);
    }

    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void delete(City city) {
        if (!cities.remove(city)) {
            throw new IllegalArgumentException("City does not exist");
        }
    }

    public int countCities() {
        return cities.size();
    }

}
