package com.awei.cloud.service;



import com.awei.cloud.entity.User;

import java.util.List;

/**
 * @Author: 梁云亮
 * @Date 2020/4/21 16:58
 * @Description:
 */
public interface UserService {


    User selectByPrimaryKey(Integer id);

    List<User> selectByUsername(String username);

}
