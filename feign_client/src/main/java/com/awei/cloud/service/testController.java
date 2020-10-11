package com.awei.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/il")
public class testController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public ModelMap getUserList() {
        return userService.getUserList();
    }

}
