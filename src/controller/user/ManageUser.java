package controller.user;

import model.user.Register;
import model.user.User;
import storage.user.RegisterFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManageUser{
    public static List<User> userList = new ArrayList<User>();

    public ManageUser() {
    }

    //    Check đăng nhập
    public static boolean checkLogin(String name, String password) {
        boolean check = false;
        List<Register> registerList = RegisterFile.getInstance().readData();
        for (int i = 0; i< registerList.size(); i++) {
            if (Objects.equals(registerList.get(i).getName(),name) && Objects.equals(registerList.get(i).getPassword(),password)) {
                check = true;
            }
        }
        return check;
    }

}
