package com.awei.cloud.service.Do;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CompanyDO {

    private String comId;

    private String comName;

    private String comHolding;

    private String comLocal;

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

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }
}
