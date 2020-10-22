package com.awei.cloud.service.impl;

import com.awei.cloud.dao.UserMapper;
import com.awei.cloud.entity.User;
import com.awei.cloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 梁云亮
 * @Date 2020/4/21 16:58
 * @Description:
 */   
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;



    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
