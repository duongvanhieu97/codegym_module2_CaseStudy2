package model.products;

import java.io.Serializable;

public class Laptop implements Serializable,InterfaceProducts {
    private int id;
    private String name;
    private double price;
    private String brand;

    public Laptop() {
    }

    public Laptop(int id, String name, double price, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void display() {
        System.out.println("Laptop: ");
        System.out.println("Id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Brand: " + getBrand());

    }
}
