package controller.products;

import model.products.Products;
import storage.products.ProductsFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static view.User.editMenu;


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
            if (checkIDProduct(id)) {
                System.out.println("Bạn nhập thông tin cần sửa");
                Scanner scanner = new Scanner(System.in);
                String newName = scanner.nextLine();
                p.setName(newName);
                Scanner scanner1 = new Scanner(System.in);
                double newPrice = scanner1.nextDouble();
                p.setPrice(newPrice);
                readFile.writeData(listProducts);
            }else {
                System.out.println("Bạn nhập không đúng id vui lòng nhập lại");
                editMenu();
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
