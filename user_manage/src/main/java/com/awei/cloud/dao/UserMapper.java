package com.awei.cloud.dao;



import com.awei.cloud.pojo.User;

import java.util.List;

public interface UserMapper {

    /*
     * 获取用户信息
     * */
    User getInfo(String name, String password);

    /*
     * 根据id查询用户
     * */
    User selectUserById(String id);

    /*
     * 添加用户
     * */
    int insertUser(User user);

    //删除用户
    int deleteUser(String id);

    /*
     * 更新用户
     * */
    int updateUser(User user);

    /*
     * 用户列表
     * */
    List<User> getAllUser();

}
