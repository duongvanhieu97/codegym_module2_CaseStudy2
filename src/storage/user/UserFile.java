package storage.user;

import model.user.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserFile {
    public static List<User> readFile() {
        List<User> userList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("data/user.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            List<User> users = (List<User>) obj;
            ois.close();
            fis.close();
            return users;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(List<User> users) {
        try {
            FileOutputStream fos = new FileOutputStream("data/user.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Hieu","1"));
        users.add(new User("Vinh","1"));
        users.add(new User("Tuan","1"));
        users.add(new User("Han","1"));
        users.add(new User("Trung","1"));

        writeFile(users);
    }
}
