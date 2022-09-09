package view;

import model.user.Register;
import storage.user.IReadRegisterFile;
import storage.user.RegisterFile;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static controller.user.ManageRegister.addUser;
import static controller.user.ManageRegister.checkRegister;
import static controller.user.ManageUser.checkLogin;

public class User {
    public void loginSystem() {
        try {
            menuUser();
        } catch (Exception e) {
            System.out.println("Bạn đã nhập sai dữ liệu, vui lòng nhập lại");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            loginSystem();
        }

    }

    //    menu User
    private void menuUser() {
        System.out.println("1: Đăng Nhập");
        System.out.println("2: Đăng Ký");
        System.out.println("0: Thoát");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                login();
                break;
            case 2:
                addToRegister(registerList);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Vui lòng bạn nhập lại");
        }

    }

    public static List<Register> registerList;

    static {
        registerList = RegisterFile.getInstance().readData();
    }

    private void addToRegister(List<Register> registerList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin đăng ký");
        System.out.println("id");
        int id = scanner.nextInt();
        System.out.println("Tên đăng nhập");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println("Nhập mật khẩu đăng nhập của bạn");
        Scanner scanner5 = new Scanner(System.in);
        String password = scanner5.nextLine();
        System.out.println("Nhập email");
        Scanner scanner2 = new Scanner(System.in);
        String email = scanner2.nextLine();
        System.out.println("Nhập số điện thoại");
        Scanner scanner3 = new Scanner(System.in);
        String phone = scanner3.nextLine();
        System.out.println("Nhập địa chỉ của bạn");
        Scanner scanner4 = new Scanner(System.in);
        String address = scanner4.nextLine();

        CheckUser(id,name,password,email,phone,address);
    }

    private void CheckUser(int id, String name, String password, String email, String phone, String address) {
        if (checkRegister(name)) {
            System.out.println("Tài khoản đã tồn tại");
        } else {
            System.out.println("Bạn đăng ký tài khoản thành công");
            addUser(new Register(id,name,password,email,phone,address));
            System.out.println("Mời đang nhập hệ thống");
        }
        loginSystem();

    }

    private void login() {
        System.out.println("Nhập tên Đăng nhập");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nhập password");
        Scanner scanner1 = new Scanner(System.in);
        String password = scanner1.nextLine();
        checkAccount(name, password);
    }

    private void checkAccount(String name, String password) {
        try {
            if (checkLogin(name, password)) {
                System.out.println("Đăng nhập thành công");
//                Hiện thị ra menu categories
            }
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Đăng nhập thất bại");
            loginSystem();
        }
    }




}
