package com.example.listcity;

import java.util.Objects;

/**
 *This is a class that defines a city
 */

public class City implements Comparable<City> {
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCityName() {
        return city;
    }


    public String getProvinceName() {
        return province;
    }

    @Override
    public int compareTo(City o){
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

}
