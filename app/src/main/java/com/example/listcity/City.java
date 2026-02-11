package com.example.listcity;

/**
 *
 *
 */

public class City {
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

}
