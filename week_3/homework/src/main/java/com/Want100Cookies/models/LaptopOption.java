package com.Want100Cookies.models;

public class LaptopOption {

    private long id;
    private String value;
    private double price;

    public LaptopOption() {
    }

    public LaptopOption(long id, String value, double price) {
        this.id = id;
        this.value = value;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public double getPrice() {
        return price;
    }
}
