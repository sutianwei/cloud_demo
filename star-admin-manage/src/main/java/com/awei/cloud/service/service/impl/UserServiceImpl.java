package com.awei.cloud.service.service.impl;

import com.awei.cloud.dao.userDao;
import com.awei.cloud.entity.UserEntity;
import com.awei.cloud.service.Do.UserDo;
import com.awei.cloud.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl   implements UserService {

    @Autowired
    private com.awei.cloud.dao.userDao userDao;
    @Override
    public void insert(UserDo userDo) {
        UserEntity  userEntity = new UserEntity();
        userEntity.setName("su");
        userEntity.setPassword("pass");
        userEntity.setSex("nan");
        userEntity.setUid(345);
        userDao.insertUser(userEntity);
    }
}