package com.want100cookies.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LaptopOptions")
public class LaptopOption implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    private double price;

    @ManyToOne
    private LaptopComponent component;

    public LaptopOption() {
    }

    public LaptopOption(String value, double price) {
        this.value = value;
        this.price = price;
    }

    public Long getId() {
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
