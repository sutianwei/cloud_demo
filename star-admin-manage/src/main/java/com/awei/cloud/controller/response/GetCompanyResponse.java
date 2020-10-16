package com.awei.cloud.controller.response;

import com.awei.cloud.controller.VO.GetCompanyVO;

public class GetCompanyResponse {

    private GetCompanyVO company;

    public GetCompanyVO getCompany() {
        return company;
    }

    public void setCompany(GetCompanyVO company) {
        this.company = company;
    }
}
