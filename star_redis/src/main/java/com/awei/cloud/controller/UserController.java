package com.awei.cloud.controller;


import com.awei.cloud.entity.User;
import com.awei.cloud.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/set")
    public String set() {
        User user = new User();
        user.setId(1);
        user.setUserName("su");
        user.setPassword("123");
        redisUtil.set("user", user);
        redisUtil.expire("user", 10);
        return "success saved user !";
    }

    @RequestMapping("/get")
    public String get() {
        User user = (User) redisUtil.get("user");
//        redisUtil.del("user");
        return user.toString();
//        return  "";
    }
}
