package com.awei.cloud.service;



import com.awei.cloud.pojo.User;

import java.util.List;

public interface UserService {

    /*
    登录i信息核对
     */
    User loginIn(String name, String password);

    /*
     * 用户查询
     * */
    User queryUserById(String id);


    int  addUser(User  user);

    /*
     * 删除用户
     * */
    int dropUser(String id);

    /*
     * 修改用户
     * */
    int modifyUser(User user);


    List<User> queryAllUser();

    void schdule();

}
