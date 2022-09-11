package view;

import model.products.Laptop;
import model.products.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static controller.products.ManageProduct.*;

public class Product {
    public void menuCategories() {
        System.out.println("1: Laptop");
        System.out.println("2: SmartPhone");
        System.out.println("3: SmartWatch");
        System.out.println("4: Tablet");
        System.out.println("5: Products");
        System.out.println("0: Thoát");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        switch (select) {
            case 1:
// laptop
                menuLaptop();
                break;
            case 2:
//Smartphone
                menuSmartphone();

                break;
            case 3:
//SmartWatch
                menuSmartWatch();

                break;
            case 4:
//Tablet
                menuTablet();

                break;
            case 5:
                menuProducts();
            case 0:
                System.exit(0);
            default:
                System.out.println("Vui lòng bạn nhập lại");
                menuCategories();
        }
    }
    public static ArrayList<Products> listProduct;

    private void menuProducts() {
        System.out.println("Product");
        System.out.println("1: Thêm Product");
        System.out.println("2: Sửa Product");
        System.out.println("3: Xóa Product");
        System.out.println("4: Hiển thị Product");
        System.out.println("0: Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addToProduct(listProduct);
                break;

            case 2:
                editMenuProduct();
                break;

            case 3:
                deleteMenuProduct();

                break;

            case 4:
                displayList();
                break;

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại");
                menuProducts();
        }
    }

    private void editMenuProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần sửa");
        int id = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập name cần sửa");
        String name = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập price cần sửa");
        double price = scanner2.nextDouble();
        editProducts(id,name,price);
    }

    private void deleteMenuProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần xóa");
        int id = scanner.nextInt();
        deleteProducts(id);
    }

    private void addToProduct(List<Products> list) {
        System.out.println("Nhập Id Product");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println("Nhập Name Product");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println("Nhập Price Product");
        Scanner scanner3 = new Scanner(System.in);
        double price = scanner3.nextDouble();
        checkProduct(id,name,price);

    }
    private void checkProduct(int id, String name, double price) {
        if (checkIDProduct(id)) {
            System.out.println("Đã có sản phẩm này");
        }else {
            System.out.println("Bạn đã đăng ký sản phẩm Laptop thành công");
            addProduct(new Products(id,name,price));
        }
        menuProducts();
    }

    public static ArrayList<Laptop> laptopList;


    private void menuLaptop() {
        System.out.println("Laptop");
        System.out.println("1: Thêm Laptop");
        System.out.println("2: Sửa Laptop");
        System.out.println("3: Xóa Laptop");
        System.out.println("4: Hiển thị Laptop");
        System.out.println("0: Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
//                addToLaptop(laptopList);
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại");
                menuLaptop();
        }

    }






    private void menuSmartphone() {
        System.out.println("Smartphone");
        System.out.println("1: Thêm Smartphone");
        System.out.println("2: Sửa Smartphone");
        System.out.println("3: Xóa Smartphone");
        System.out.println("4: Hiển thị Smartphone");
        System.out.println("0: Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại");
                menuSmartphone();
        }

    }

    private void menuSmartWatch() {
        System.out.println("SmartWatch");
        System.out.println("1: Thêm SmartWatch");
        System.out.println("2: Sửa SmartWatch");
        System.out.println("3: Xóa SmartWatch");
        System.out.println("4: Hiển thị SmartWatch");
        System.out.println("0: Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại");
                menuSmartWatch();
        }

    }
    private void menuTablet() {
        System.out.println("Tablet");
        System.out.println("1: Thêm Tablet");
        System.out.println("2: Sửa Tablet");
        System.out.println("3: Xóa Tablet");
        System.out.println("4: Hiển thị Tablet");
        System.out.println("0: Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng nhập lại");
                menuTablet();
        }

    }


}
