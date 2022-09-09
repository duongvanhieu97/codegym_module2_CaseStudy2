package controller.user;

import model.user.User;

import java.util.ArrayList;
import java.util.List;

public class ManageUser{
    public static List<User> userList = new ArrayList<User>();

    public ManageUser() {
    }

    //    Check đăng nhập
    public static boolean checkLogin(String name, String password) {
        boolean check = false;
        for (User u : userList) {
            if (name.equals(u.getName()) && password.equals(u.getPassword())) {
                check = true;
            }
        }
        return check;
    }

}
