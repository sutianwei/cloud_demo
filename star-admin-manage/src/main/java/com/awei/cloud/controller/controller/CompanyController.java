package com.awei.cloud.controller.controller;

import com.awei.cloud.controller.VO.GetCompanyVO;
import com.awei.cloud.controller.request.DeleteCompanyRequest;
import com.awei.cloud.controller.request.GetCompanyRequest;
import com.awei.cloud.controller.request.InsertCompanyRequest;
import com.awei.cloud.controller.request.UpdateCompanyRequest;
import com.awei.cloud.controller.response.BaseResponse;
import com.awei.cloud.controller.response.GetCompanyResponse;
import com.awei.cloud.entity.CompanyEntity;
import com.awei.cloud.service.request.DeleteCompanyBizRequest;
import com.awei.cloud.service.request.GetCompanyBizRequest;
import com.awei.cloud.service.request.InsertCompanyBizRequest;
import com.awei.cloud.service.service.CompanyService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService service;

    @PostMapping("/insert_company")
    public BaseResponse insetCompany(@RequestBody InsertCompanyRequest request) {

        InsertCompanyBizRequest bizRequest = new InsertCompanyBizRequest();
        bizRequest.setComHolding(request.getComHolding());
        bizRequest.setComLocal(request.getComLocal());
        bizRequest.setComName(request.getComName());
        service.insert(bizRequest);

        BaseResponse  response = new BaseResponse();
        response.setSuccess(true);
        response.setMsg("ok");
        return response;

    }

    @PostMapping("delete")
    public void delete(@RequestBody DeleteCompanyRequest request) {

        DeleteCompanyBizRequest bizRequest = new DeleteCompanyBizRequest();
        bizRequest.setIds(request.getIds());
        service.deleteCompany(bizRequest);

    }

    @ApiParam(name = "获取公司信息")
    @PostMapping(path = "/get_company")
    public GetCompanyResponse getCompany(@RequestBody GetCompanyRequest request) {

        GetCompanyBizRequest bizRequest = new GetCompanyBizRequest();
        bizRequest.setComId(request.getComId());

        CompanyEntity entity = service.getCompany(bizRequest);

        GetCompanyVO companyVO = new GetCompanyVO();
        companyVO.setComHolding(entity.getComHolding());
        companyVO.setComId(entity.getComId());
        companyVO.setComLocal(entity.getComLocal());
        companyVO.setComName(entity.getComName());

        GetCompanyResponse response = new GetCompanyResponse();
        response.setCompany(companyVO);

        return response;
    }

    @PostMapping("update")
    public void updateCompany(@RequestBody UpdateCompanyRequest request) {
        service.updateCompany(request);

    }
}
