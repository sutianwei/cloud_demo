package com.awei.cloud.controller;

public class GetUserRequest {

    private Integer uid;

    @Override
    public String toString() {
        return "GetUserRequest{" +
                "uid=" + uid +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
