package com.zoho.controller;

import com.zoho.model.UserDetails;
import com.zoho.model.UserList;

import java.util.ArrayList;

public class Admin {
    public Admin() {
        hardCode();
    }

    UserList ul = new UserList();

    public ArrayList<UserDetails> getPassWord() {
        return getPassWord();
    }


    public void hardCode() {
        ul.setUserList(new UserDetails("Bhavya", "Bhavya@13", (byte) 23, "Bhavya13@gmail", "Bhavya@12"));
        ul.setUserList(new UserDetails("Arthi", "Arthi@13", (byte) 22, "Arthi13@gmail", "Arthi@12"));
        ul.setUserList(new UserDetails("Akalya", "Akalya@13", (byte) 22, "Akalya3@gmail", "Akalya@12"));

        for (UserDetails users : ul.getUserList()) {
            users.setPersonalFeed("Default feed");
        }

    }

}
