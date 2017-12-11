package com.want100cookies;

public class Application {

    public static String hello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static String properNameFormat(String name) {
        if (name == null) {
            throw new IllegalArgumentException("You cannot supply null as a value");
        }

        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
