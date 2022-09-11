package model.products;

import java.io.Serializable;

public class Laptop extends Products implements Serializable,InterfaceProducts {
    public Laptop(int id, String name, String price) {
        super(id, name, price);
    }

    public Laptop(int id, String name, double price) {
        super(id, name, price);
    }
}
