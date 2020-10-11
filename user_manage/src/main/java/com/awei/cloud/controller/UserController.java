package com.awei.cloud.controller;


import com.awei.cloud.pojo.User;
import com.awei.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    /*
     * 显示所有用户
     * */
    @RequestMapping("/users")
    public String showUsers(ModelMap modelMap) {
        List<User> userList = userService.queryAllUser();
        modelMap.addAttribute("userList", userList);
        return "users";
    }


    /*
     * 新增用户信息
     * */
    @RequestMapping("/addUser")
    public Map addUser(User user) {
        int flag = userService.addUser(user);
        Map<String, Object> map = new HashMap<>();
        if (flag == 1) {
            map.put("msg", "成功");
            return map;
        } else {
            map.put("msg", "失败");
            return map;
        }
    }

    /*
     * 删除用户
     *
     * */
    @RequestMapping("/deleteUser+{id}")
    public String dropUser(@PathVariable("id") String id, ModelMap modelMap) {
        int flag = userService.dropUser(id);
        List<User> userList = userService.queryAllUser();
        modelMap.addAttribute("userList", userList);
        if (flag == 1) {
            return "users";

        } else {
            return "error";
        }
    }

    /*
    * 显示用户
    * */
    @RequestMapping("/user+{id}")
    public String queryUser(@PathVariable("id") String id, ModelMap modelMap) {
        User user = userService.queryUserById(id);
        modelMap.addAttribute("user", user);
        return "userInfo";
    }

    /*
     * 修改用户
     * */
    @RequestMapping("/modifyUser")
    public Map modifyUser(User user) {
        int flag = userService.modifyUser(user);
        Map<String, Object> map = new HashMap<>();
        if (flag == 1) {
            map.put("msg", "ok");
            return map;
        } else {
            map.put("msg", "no");
            return map;
        }
    }


}
