package model.products;

import java.io.Serializable;

public class SmartPhone extends Products implements Serializable ,InterfaceProducts{

    public SmartPhone(int id, String name, String price) {
        super(id, name, price);
    }

    public SmartPhone(int id, String name, double price) {
        super(id, name, price);
    }
}
