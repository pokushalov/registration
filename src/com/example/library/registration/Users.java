package com.example.library.registration;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

public class Users {
    public static Users instance;
    public ArrayList<User> userList;


    public Users() {
        userList = new ArrayList<>();
    }


    public static Users getInstance()
    {
        if (instance == null)
        {
            instance = new Users();
        }
        return instance;
    }


    public boolean addUser(User user) {
        if (!isEmailUnique(user.getEmail())) {
            System.out.println("Email already in use.");
            return false;
        }
        if (!isPasswordStrong(user.getPassword())) {
            System.out.println("Password is not strong enough.");
            return false;
        }
        userList.add(user);
        return true;
    }

    public boolean isEmailUnique(String email) {
        for (User user : userList) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return false;
            }
        }
        return true;
    }

    private boolean isPasswordStrong(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*");
    }

    public ArrayList<User> getUserList()
    {
        return userList;
    }

}
