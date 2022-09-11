package controller.products;

import model.products.Products;
import storage.products.ProductsFile;

import java.util.ArrayList;
import java.util.List;


public class ManageProduct {
    private static ProductsFile readFile = ProductsFile.getInstance();
    public static List<Products> listProducts = new ArrayList<>();

    public static void addProduct(Products products) {
//        listProducts = readFile.readData();
        listProducts.add(products);
        ProductsFile.getInstance().writeData(listProducts);
    }

    public static void editProducts(int id, String name, double price) {
        listProducts = readFile.readData();
        for (Products p : listProducts) {
            if (p.getId() == id) {
                p.setName(name);
                p.setPrice(price);
            }
        }
    }

    public static void deleteProducts(int id) {
        listProducts = readFile.readData();
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.remove(i);
                readFile.writeData(listProducts);

            }
        }
    }

    public static void displayList() {
        List<Products> products;
        products = readFile.readData();
        for (Products p : products
        ) {
            System.out.println(p);
        }
    }

    public static boolean checkIDProduct(int id) {
        boolean check = false;
        for (Products p : listProducts) {
            if (id == (p.getId())) {
                check = true;
            }
        }
        return check;
    }
}
