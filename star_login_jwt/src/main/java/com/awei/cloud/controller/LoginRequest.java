package com.awei.cloud.controller;

public class LoginRequest {
    private String name;
    private String pass;

    @Override
    public String toString() {
        return "LoginRequest{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
