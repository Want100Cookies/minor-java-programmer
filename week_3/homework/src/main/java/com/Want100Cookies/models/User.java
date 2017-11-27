package com.Want100Cookies.models;

public class User {

    private final long id;
    private final String name;
    private final String email;
    private final String iban;
    private final String address1;
    private final String address2;
    private final String postal_code;
    private final String city;
    private final String country;

    public User(long id, String name, String email, String iban, String address1, String address2, String postal_code, String city, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.iban = iban;
        this.address1 = address1;
        this.address2 = address2;
        this.postal_code = postal_code;
        this.city = city;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getIban() {
        return iban;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getPostalCode() {
        return postal_code;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
