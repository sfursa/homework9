package com.company;

public class Address {
    private String city;
    private String street;
    private int house;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return  "г." + city + ", " +
                "ул." + street + ", " +
                "д." + house;
    }

    public Address(String city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }
}
