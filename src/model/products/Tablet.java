package model.products;

import java.io.Serializable;

public class Tablet extends Products implements Serializable ,InterfaceProducts{

    public Tablet(int id, String name, String price) {
        super(id, name, price);
    }

    public Tablet(int id, String name, double price) {
        super(id, name, price);
    }
}
