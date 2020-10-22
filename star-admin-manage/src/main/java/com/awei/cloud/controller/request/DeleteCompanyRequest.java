package com.awei.cloud.controller.request;


import java.util.List;

public class DeleteCompanyRequest {

    private List<String> ids;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
