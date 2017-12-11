package com.want100cookies.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "LaptopComponents")
public class LaptopComponent implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String message;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "component_id")
    private List<LaptopOption> options;

    @ManyToOne
    private Laptop laptop;

    public LaptopComponent() {
    }

    public LaptopComponent(String name, String message, List<LaptopOption> options) {
        this.name = name;
        this.message = message;
        this.options = options;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public List<LaptopOption> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "LaptopComponent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", options=" + options +
                '}';
    }
}
