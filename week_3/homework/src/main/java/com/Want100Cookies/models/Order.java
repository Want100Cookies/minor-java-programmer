package com.Want100Cookies.models;

import java.util.Map;

public class Order {

    private final long id;
    private final User user;
    private final Laptop laptop;
    private final Map<LaptopComponent, LaptopOption> selectedOptions;

    public Order(long id, User user, Laptop laptop, Map<LaptopComponent, LaptopOption> selectedOptions) {
        this.id = id;
        this.user = user;
        this.laptop = laptop;
        this.selectedOptions = selectedOptions;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public Map<LaptopComponent, LaptopOption> getSelectedOptions() {
        return selectedOptions;
    }
}
