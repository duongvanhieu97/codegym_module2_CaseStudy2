package model.user;

import java.io.Serializable;


public class User extends Register implements Serializable {
    private String user;
    private String password;

    public User() {

    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" + "user='" + user + '\'' + ", password='" + password + '\'' + '}';
    }
}
