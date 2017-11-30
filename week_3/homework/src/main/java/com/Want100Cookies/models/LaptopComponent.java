package com.Want100Cookies.models;

import java.util.List;

public class LaptopComponent {

    private long id;
    private String name;
    private String message;
    private List<LaptopOption> options;
    private LaptopOption selected;

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

    public LaptopOption getSelected() {
        return selected;
    }
}
