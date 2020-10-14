package com.awei.cloud.service.service;

import com.awei.cloud.service.request.DeleteCompanyBizRequest;
import com.awei.cloud.service.request.InsertCompanyBizRequest;

import java.util.List;

public interface CompanyService {

    public void insert(InsertCompanyBizRequest request);

    void deleteCompany(DeleteCompanyBizRequest  bizRequest);
}
