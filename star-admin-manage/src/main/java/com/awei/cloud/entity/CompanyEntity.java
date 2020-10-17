package com.awei.cloud.entity;


import javax.persistence.*;


public class CompanyEntity {


    private Integer sid;

    private String comId;

    @Column(length = 12)
    private String comName;

    @Column(length = 12)
    private String comHolding;

    @Column
    private String comLocal;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComHolding() {
        return comHolding;
    }

    public void setComHolding(String comHolding) {
        this.comHolding = comHolding;
    }

    public String getComLocal() {
        return comLocal;
    }

    public void setComLocal(String comLocal) {
        this.comLocal = comLocal;
    }
}
