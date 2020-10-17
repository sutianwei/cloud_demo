package com.awei.cloud.controller.controller;

import com.awei.cloud.controller.request.InsertUserRequest;
import com.awei.cloud.controller.response.BaseResponse;
import com.awei.cloud.service.request.InsertUserBizRequest;
import com.awei.cloud.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody InsertUserRequest request){

        InsertUserBizRequest bizRequest = new InsertUserBizRequest();
        bizRequest.setCompany(request.getCompany());
        bizRequest.setName(request.getName());
        bizRequest.setPassword(request.getPassword());
        bizRequest.setSex(request.getSex());

        BaseResponse  response =   userService.insert(bizRequest);

        response.setMsg("ok");
        response.setSuccess(true);
        response.setData(response.getData());
        return  response;
    }
}
