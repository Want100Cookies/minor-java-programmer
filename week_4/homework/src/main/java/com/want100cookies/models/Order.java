package com.want100cookies.models;

public class Order {

    private long id;
    private User user;
    private Laptop laptop;

    public Order() {
    }

    public Order(long id, User user, Laptop laptop) {
        this.id = id;
        this.user = user;
        this.laptop = laptop;
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
}
