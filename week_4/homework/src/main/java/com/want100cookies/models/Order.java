package com.want100cookies.models;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;

    @ManyToOne
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", laptop=" + laptop +
                '}';
    }
}
