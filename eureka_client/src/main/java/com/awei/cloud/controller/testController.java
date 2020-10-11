package com.awei.cloud.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class testController {

        @RequestMapping("/getUserList")
        public ModelMap getUserList() {
            ModelMap modelMap = new ModelMap();
            List<String> userList = new ArrayList<String>();
            userList.add("用户1");
            userList.add("用户2");
            userList.add("用户3");
            modelMap.put("data", userList);
            return modelMap;
        }


}
