package com.awei.cloud.service.service.impl;

import com.awei.cloud.controller.response.BaseResponse;
import com.awei.cloud.dao.CompanyDao;
import com.awei.cloud.entity.CompanyEntity;
import com.awei.cloud.entity.UserEntity;
import com.awei.cloud.service.Do.UserDo;
import com.awei.cloud.service.request.InsertUserBizRequest;
import com.awei.cloud.service.service.UserService;

import com.awei.cloud.util.UUIDUtils;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private com.awei.cloud.dao.userDao userDao;
    @Autowired
    private CompanyDao companyDao;

    @Override
    public BaseResponse insert(InsertUserBizRequest bizRequest) {


        List<CompanyEntity> companyEntity = companyDao.selectCompany();
        companyEntity.forEach(k -> {

            if (k.getComName() != bizRequest.getCompany()) {

               bizRequest.setCompany("暂无公司");
            }

        });
        UserEntity entity = new UserEntity();
        entity.setName(bizRequest.getName());
        entity.setPassword(bizRequest.getPassword());
        entity.setSex(bizRequest.getSex());
        entity.setUid(UUIDUtils.getUUID());
        entity.setCompany(bizRequest.getCompany());
        userDao.insertUser(entity);



return  null;



     }
}
