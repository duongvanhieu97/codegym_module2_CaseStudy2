package model.products;

import java.io.Serializable;

public class Tablet implements Serializable ,InterfaceProducts{
    private int id;
    private String name;
    private double price;

    public Tablet() {
    }

    public Tablet(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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


    public void display() {
        System.out.println("Tablet: ");
        System.out.println("Id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("Price: " + getPrice());

    }
}
