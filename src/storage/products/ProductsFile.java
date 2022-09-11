package storage.products;
import model.products.Products;
import model.user.Register;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductsFile implements IReadWriteData {

    private static ProductsFile instance=null;

    private ProductsFile() {
    }

    public static ProductsFile getInstance(){
        if (instance == null) instance = new ProductsFile();
        return instance;
    }

    public List<Products> readData() {
        List<Products> registerList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("data/products.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            List<Products> products = (List<Products>) obj;
            ois.close();
            fis.close();
            return products;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void writeData(List<Products> Products) {
        try {
            FileOutputStream fos = new FileOutputStream("data/products.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Products> readData(String path) {
        List<Products> products = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            products = (List<Products>) obj;
            return products;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeData(List<Products> list, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
