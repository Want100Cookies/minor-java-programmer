package com.want100cookies.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Laptops")
public class Laptop implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double base_price;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "laptop_id")
    private List<LaptopComponent> components;

    public Laptop() {
    }

    public Laptop(String name, double base_price, List<LaptopComponent> components) {
        this.name = name;
        this.base_price = base_price;
        this.components = components;
    }

    public Long getId() {
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

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", base_price=" + base_price +
                ", components=" + components +
                '}';
    }
}
