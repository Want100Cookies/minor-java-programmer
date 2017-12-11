package com.want100cookies.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @ManyToOne
    private Laptop laptop;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "OrderOption", joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "option_id", referencedColumnName = "id"))
    private List<LaptopOption> selectedOptions;

    public Order() {
    }

    public Order(User user, Laptop laptop, List<LaptopOption> selectedOptions) {
        this.user = user;
        this.laptop = laptop;
        this.selectedOptions = selectedOptions;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public List<LaptopOption> getSelectedOptions() {
        return selectedOptions;
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
