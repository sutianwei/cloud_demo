package com.awei.cloud.entity;


import javax.persistence.*;

@Entity
@Table(name = "COMPANY")
public class CompanyEntity {

    @Id
    @GeneratedValue()
    private Integer id;

    @Column(length = 32)
    private String comId;

    @Column(length = 12)
    private String comName;

    @Column(length = 12)
    private String comHolding;

    @Column
    private String comLocal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
