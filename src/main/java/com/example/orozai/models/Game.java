package com.example.orozai.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Game {

    @Id
    @GeneratedValue


    private int id;
    String name;
    Integer price;

    public Game(int id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Game() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
