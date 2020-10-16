package com.awei.cloud.controller.controller;

import com.awei.cloud.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService userService;
    @PostMapping("/insert")
    public void insert(){

        userService.insert(null);
    }
}
