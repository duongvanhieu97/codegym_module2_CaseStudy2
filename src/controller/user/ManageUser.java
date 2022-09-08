package controller.user;

import model.user.Register;
import storage.user.RegisterFile;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ManageUser {
    public void loginSystem() {
        try {
            menuUser();
        } catch (InputMismatchException e) {
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
        registerList = RegisterFile.readFile();
    }

    public void addRegister(Register register) {
        registerList.add(register);
        RegisterFile.writeFile(registerList);
    }
    private void addToRegister(List<Register> registerList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin đăng ký");
        System.out.println("id");
        int id = scanner.nextInt();
        System.out.println("Tên đăng nhập");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println("Nhập email");
        Scanner scanner2 = new Scanner(System.in);
        String email = scanner2.nextLine();
        System.out.println("Nhập số điện thoại");
        Scanner scanner3 = new Scanner(System.in);
        String phone = scanner3.nextLine();
        System.out.println("Nhập địa chỉ của bạn");
        Scanner scanner4 = new Scanner(System.in);
        String address = scanner4.nextLine();
        System.out.println("Nhập mật khẩu đăng nhập của bạn");
        Scanner scanner5 = new Scanner(System.in);
        String password = scanner5.nextLine();

        Register register= new Register(id, name, email, phone, address, password);
        registerList.add(register);
        RegisterFile.writeFile(registerList);

    }

//    private void checkUser(int id, String name, String email, String phone, String address, String password) {
//        if (checkRegister(name)) {
//            System.out.println("Tài khoản đã tồn tại");
//        } else if (ManageRegister.checkFile()) {
//            writeUser(id, name, email, phone, address, password);
//            System.out.println("Bạn đăng ký tài khoản thành công");
//        }
//        loginSystem();

//    }
//
//
//    private void writeUser(int id, String name, String email, String phone, String address, String password) {
//        ManageRegister.setRegisterList(id, name, email, phone, address, password);
//    }
//
//    private boolean checkRegister(String name) {
//        for (Register register : ManageRegister.getRegisterList()) {
//            boolean checkRegister = name.equals(register.getName());
//            if (checkRegister) {
//                return true;
//            }
//
//        }
//        return false;
//    }

    private void login() {

    }
}
