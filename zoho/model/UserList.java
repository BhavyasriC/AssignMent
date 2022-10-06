package com.zoho.model;

import java.util.ArrayList;

public class UserList {
//database

    private UserDetails UserDetails;
    static private ArrayList<UserDetails> userList = new ArrayList<>();


    public ArrayList<UserDetails> getUserList() {
        return userList;
    }

    public void setUserList(UserDetails user) {
        userList.add(user);

    }
}
