package com.example.adoptercodeexample.model;

public class CarModel {
    private String Name;
    private String Price;
    private int Image;
    private String Description;

    public CarModel(String name, String price, int image, String description) {
        Name = name;
        Price = price;
        Image = image;
        Description = description;
    }

    public CarModel(String a, String price, int a1) {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
