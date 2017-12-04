package com.want100cookies.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LaptopOptions")
public class LaptopOption implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public String toString() {
        return "LaptopOption{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", price=" + price +
                '}';
    }
}
