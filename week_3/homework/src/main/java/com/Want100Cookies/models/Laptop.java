package com.Want100Cookies.models;

import java.util.List;

public class Laptop {

    private final long id;
    private final String name;
    private final double base_price;
    private final List<LaptopComponent> components;

    public Laptop(long id, String name, double base_price, List<LaptopComponent> components) {
        this.id = id;
        this.name = name;
        this.base_price = base_price;
        this.components = components;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return base_price;
    }

    public List<LaptopComponent> getComponents() {
        return components;
    }
}
