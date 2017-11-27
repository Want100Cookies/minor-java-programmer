package com.Want100Cookies.models;

import java.util.List;

public class LaptopComponent {

    private final long id;
    private final String name;
    private final String message;
    private final List<LaptopOption> available;

    public LaptopComponent(long id, String name, String message, List<LaptopOption> available) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.available = available;
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
        return available;
    }
}
