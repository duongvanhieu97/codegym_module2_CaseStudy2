package storage.user;

import model.user.Register;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RegisterFile implements IReadRegisterFile {
    private static RegisterFile registerFile;

    public RegisterFile() {

    }

    public static RegisterFile getInstance() {
        if (registerFile == null) {
            registerFile = new RegisterFile();
        }
        return registerFile;
    }


    @Override
    public List<Register> readData() {
        List<Register> registerList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("data/register.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            List<Register> registers = (List<Register>) obj;
            ois.close();
            fis.close();
            return registers;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void writeData(List<Register> list) {
        try {
            FileOutputStream fos = new FileOutputStream("data/register.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Register> readData(String path) {
        List<Register> list = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            list = (List<Register>) obj;
            return list;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeData(List<Register> list, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
