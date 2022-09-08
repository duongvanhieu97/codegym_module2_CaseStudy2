package storage.user;

import model.user.Register;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RegisterFile {
    public static List<Register> readFile() {
        List<Register> registerList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("data/register.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            List<Register> registers = (List<Register>) obj;
            ois.close();
            fis.close();
            return registers;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(List<Register> registers) {
        try {
            FileOutputStream fos = new FileOutputStream("data/register.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(registers);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Register> registers = new ArrayList<>();
        registers.add(new Register(1,"Hieu","abc@gmail.com","0923451124","HN","1"));
        registers.add(new Register(2,"Vinh","abc@gmail.com","0923451124","HN","1"));
        registers.add(new Register(3,"Tuan","abc@gmail.com","0923451124","HN","1"));
        registers.add(new Register(4,"Han","abc@gmail.com","0923451124","HN","1"));
        registers.add(new Register(5,"Trung","abc@gmail.com","0923451124","HN","1"));
        writeFile(registers);
    }
}
