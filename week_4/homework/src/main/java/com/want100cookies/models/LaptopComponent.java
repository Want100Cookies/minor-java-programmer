package com.want100cookies.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "LaptopComponents")
public class LaptopComponent implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String message;

    @OneToMany
    private List<LaptopOption> options;

//    private LaptopOption selected;

    public LaptopComponent() {
    }

    public LaptopComponent(long id, String name, String message, List<LaptopOption> options) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.options = options;
    }

    public long getId() {
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

//    public LaptopOption getSelected() {
//        return selected;
//    }


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
