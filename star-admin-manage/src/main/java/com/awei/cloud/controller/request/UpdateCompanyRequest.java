package com.awei.cloud.controller.request;

import com.alibaba.fastjson.annotation.JSONField;

public class UpdateCompanyRequest {

    private String comId;

    @JSONField(name = "com_name")
    private String comName;

    @JSONField(name = "com_holding")
    private String comHolding;

    @JSONField(name = "com_local")
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
