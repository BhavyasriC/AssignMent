package com.zoho.controller;

import java.util.Scanner;

import com.zoho.model.UserDetails;
import com.zoho.model.UserList;
import com.zoho.view.LoginPage;

public class ManageUser {
    UserList ul = new UserList();
    // validation
    Scanner sc = new Scanner(System.in);

    public UserDetails login(String userName, String passWord) {
        UserDetails user = new UserDetails();
        boolean flag = false;
        for (UserDetails u : ul.getUserList()) {
            if (u.getUserName().equals(userName) && u.getPassword().equals(passWord)) {
                flag = true;
                user = u;

            }
            if (!u.getUserName().equals(userName) && u.getPassword().equals(passWord))
                System.out.println("Invalid UserName");
            if (u.getUserName().equals(userName) && !u.getPassword().equals(passWord)) {
                System.out.println("Invalid password");
            }
        }
        if (flag)
            System.out.println("login Sucessfully");
        else
            System.out.println("create account");

        return user;
    }

    public void register(String name, String userName, byte age, String emailId, String password, String confirmPassWord) {
        UserDetails newUSer = new UserDetails(name, userName, age, emailId, password);
        ul.setUserList(newUSer);
    }

    public void getInputUser() {

        System.out.println("Enter name");
        String getName = sc.next();
        System.out.println("Enter username");
        String getUserName = sc.next();
        System.out.println("Enter Age");
        byte getAge = sc.nextByte();
        System.out.println("Enter mailId");
        String getEmailId = sc.next();
        System.out.println("Enter password");
        String getPassword = sc.next();
        System.out.println("Enter confirm password");
        String getConfirmPassword = sc.next();
        if (getPassword.equals(getConfirmPassword))
            register(getName, getUserName, getAge, getEmailId, getPassword, getConfirmPassword);

    }

    public <user> void getUserChoice() {
        LoginPage login = new LoginPage();
        login.option();
        int choice = 0;
        WHILE:
        while (true) {

            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    getInputUser();
                    login.option();
                    break;
                case 2:
                    System.out.println("Enter username");
                    String getUserName = sc.next();
                    System.out.println("Enter password");
                    String getPassword = sc.next();
                    UserDetails user = login(getUserName, getPassword);
//                    viewProfile(user);
                    feed(user);
                    login.option();
                    break;
                default:
                    System.out.println("Exit");
                    break WHILE;
            }
        }

    }

    private void feed(UserDetails user) {
        for (String feed : user.getPersonalFeed())
            System.out.println(feed);
    }

    public void viewProfile(UserDetails user) {
        System.out.println("Name:" + user.getName() + " user name:" + user.getUserName() + " Age:" + user.getAge());
    }


    public void friendFeed(){

    }

}

