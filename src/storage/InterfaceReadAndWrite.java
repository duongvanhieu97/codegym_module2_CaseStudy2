package storage;

import java.util.List;

public interface InterfaceReadAndWrite<E> {
    List<E> readFile();
    void writeFile(List<E> list);
}
