package org.example.models;

public class User {

    private String name;
    private String country;
    private String city;
    private Long card;
    private Integer month;
    private Integer year;

    public User() {};

    public User(String name, String country, String city, Long card, Integer month, Integer year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
