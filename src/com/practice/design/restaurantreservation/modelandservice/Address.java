package com.practice.design.restaurantreservation.modelandservice;

public class Address {

    private City city;
    private String locationAddress;

    public Address(final City city, final String locationAddress) {
        this.city = city;
        this.locationAddress = locationAddress;
    }
}
