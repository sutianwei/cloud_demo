package com.awei.cloud.service.request;

public class InsertCompanyBizRequest {
    private String comId;

    private String comName;

    private String comHolding;

    private String comLocal;

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
