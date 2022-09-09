package controller.user;

import model.user.Register;
import model.user.User;
import storage.user.RegisterFile;

import java.util.ArrayList;
import java.util.List;

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
        for (User u : registerList) {
            if (name.equals(name)) {
                u.setName(name);
                u.setPassword(password);
                RegisterFile.getInstance().writeData(registerList);
            }
        }
    }

    // xóa User
    public static void deleteUser(String name) {
        for (int i = 0; i < registerList.size(); i++) {
            if (registerList.get(i).getName().equals(name)) {
                registerList.remove(i);
                RegisterFile.getInstance().writeData(registerList);

            }
        }
    }

    //    Hiển thị danh sách user
    public static void displayList() {
        for (User u : userList) {
            System.out.println(u.toString());
            RegisterFile.getInstance().writeData(registerList);

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

