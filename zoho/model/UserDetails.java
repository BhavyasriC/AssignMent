package com.zoho.model;

import java.util.Stack;

public class UserDetails {
    private String name;
    private String userName;
    private byte age;
    private String emailId;
    private String password;

    public Stack<String> getPersonalFeed() {
        return personalFeed;
    }

    public void setPersonalFeed(String feed) {
        this.personalFeed.push(feed);
    }

    private Stack<String> personalFeed = new Stack<>();
    public UserDetails(String name, String userName, byte age, String emailId, String password) {
        setName(name);
        setUserName(userName);
        setAge(age);
        setEmailId(emailId);
        setPassword(password);
    }
   public UserDetails(){

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    public byte getAge() {
        return age;
    }

    private void setAge(byte age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    private void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
}
