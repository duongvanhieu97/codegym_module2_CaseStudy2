package storage.user;

import model.user.Login;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoginFile {
    public static List<Login> readFile() {
        List<Login> loginList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("data/login.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            List<Login> logins = (List<Login>) obj;
            ois.close();
            fis.close();
            return logins;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(List<Login> logins) {
        try {
            FileOutputStream fos = new FileOutputStream("data/login.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(logins);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Login> logins = new ArrayList<>();
        logins.add(new Login("Hieu","1"));
        logins.add(new Login("Vinh","1"));
        logins.add(new Login("Tuan","1"));
        logins.add(new Login("Han","1"));
        logins.add(new Login("Trung","1"));

        writeFile(logins);
    }
}
