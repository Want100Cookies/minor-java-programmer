package com.Want100Cookies.models;

public class LaptopOption {

    private final long id;
    private final String value;
    private final double price;

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
