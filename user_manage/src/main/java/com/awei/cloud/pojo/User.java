package com.awei.cloud.pojo;

import java.io.Serializable;

public class User   implements Serializable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /*
     * 用户id
     * */
    private int id;
    /*
     * 用户姓名
     * */
    private String name;
    /*
     * 用户密码
     * */
    private String password;

    /*
     * 用户角色
     * */
    private String role;


}
