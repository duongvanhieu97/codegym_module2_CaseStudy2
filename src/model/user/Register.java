package model.user;

import java.io.Serializable;

public class Register extends User implements Serializable {
    private String email;
    private String phone;
    private String address;

    public Register(int id, String name, String password, String email, String phone, String address) {
        super(id, name, password);
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Register{" +
                super.toString() +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
