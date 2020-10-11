package com.awei.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name ="eureka-client" )
public interface UserService {
    @RequestMapping(value = "/getUserList")
    public ModelMap getUserList();
}