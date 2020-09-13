package com.cezarypokropek.restaurantapp;

import androidx.annotation.NonNull;

public class Dish {

    private String title;
    private String description;
    private int price;

    public Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + ' ' +
                ", description : '" + description + ' ' +
                ", price = " + price;
    }

}
