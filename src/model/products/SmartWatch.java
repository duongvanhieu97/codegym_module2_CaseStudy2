package model.products;

import java.io.Serializable;

public class SmartWatch extends Products implements Serializable ,InterfaceProducts{

    public SmartWatch(int id, String name, String price) {
        super(id, name, price);
    }

    public SmartWatch(int id, String name, double price) {
        super(id, name, price);
    }
}
