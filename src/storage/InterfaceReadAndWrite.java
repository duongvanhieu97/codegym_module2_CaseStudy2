package storage;

import model.products.Laptop;
import model.user.Register;

import java.util.List;

public interface InterfaceReadAndWrite<E> {
    List<E> readData();
    void writeData(List<E> list);
    List<E> readData(String path);
    void writeData(List<E> list, String path);
}
