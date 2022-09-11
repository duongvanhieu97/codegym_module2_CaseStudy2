package controller.user;

import model.user.Register;
import model.user.User;
import storage.user.RegisterFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static controller.user.ManageUser.checkLogin;
import static view.User.*;

public class ManageRegister {
    private static RegisterFile readWriteData = RegisterFile.getInstance();

    public static List<Register> registerList = new ArrayList<>();
    public static List<User> userList = new ArrayList<>();

    //add user
    public static void addUser(Register register) {
        registerList = readWriteData.readData();
        registerList.add(register);
        RegisterFile.getInstance().writeData(registerList);
    }

    //   Sửa user
    public static void editUser(String name, String password) {
        registerList = readWriteData.readData();
        for (User u : registerList) {
            if (checkLogin(name,password)) {
                System.out.println("Bạn nhập thông tin cần sửa");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập mật khẩu mới ");
                String newPassword = scanner.nextLine();
                u.setPassword(newPassword);
                RegisterFile.getInstance().writeData(registerList);
            }else {
                System.out.println("Bạn nhập không đúng tên với password đăng nhập");
                editMenu();
            }
        }
    }

    // xóa User
    public static void deleteUser(String name) {
        registerList = readWriteData.readData();
        for (int i = 0; i < registerList.size(); i++) {
            if (registerList.get(i).getName().equals(name)) {
                registerList.remove(i);
                RegisterFile.getInstance().writeData(registerList);

            }
        }
    }

    //    Hiển thị danh sách user
    public static void displayList() {
        List<Register> users;
        users = RegisterFile.getInstance().readData();
        for (Register register : users
        ) {
            System.out.println(register);
        }
    }

    //    check đăng ký
    public static boolean checkRegister(String name) {
        boolean check = false;
        for (Register u : registerList) {
            if (name.equals(u.getName())) {
                check = true;
            }
        }
        return check;
    }



}

