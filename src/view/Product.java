package view;

import java.util.Scanner;
import view.User;

public class Product {
    public void menuCategories() {
        System.out.println("1: Laptop");
        System.out.println("2: SmartPhone");
        System.out.println("3: SmartWatch");
        System.out.println("4: Tablet");

        System.out.println("0: Thoát");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        switch (select) {
            case 1:
// laptop
                break;
            case 2:
//Smartphone
                break;
            case 3:
//SmartWatch
                break;
            case 4:
//Tablet
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Vui lòng bạn nhập lại");
                menuCategories();
        }
    }
}
