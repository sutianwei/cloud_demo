package com.awei.cloud.controller.controller;

import com.awei.cloud.controller.request.InsertCompanyRequest;
import com.awei.cloud.service.request.InsertCompanyBizRequest;
import com.awei.cloud.service.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService service;

    @PostMapping("/insert_company")
    public void insetCompany(@RequestBody InsertCompanyRequest request) {

        InsertCompanyBizRequest bizRequest = new InsertCompanyBizRequest();
        bizRequest.setComHolding(request.getComHolding());
        bizRequest.setComLocal(request.getComLocal());
        bizRequest.setComName(request.getComName());
        service.insert(bizRequest);
    }
}
