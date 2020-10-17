package com.awei.cloud.service.service.impl;

import com.awei.cloud.controller.response.BaseResponse;
import com.awei.cloud.dao.CompanyDao;
import com.awei.cloud.entity.CompanyEntity;
import com.awei.cloud.entity.UserEntity;
import com.awei.cloud.service.Do.UserDo;
import com.awei.cloud.service.request.InsertUserBizRequest;
import com.awei.cloud.service.service.UserService;

import com.awei.cloud.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private com.awei.cloud.dao.userDao userDao;
    @Autowired
    private CompanyDao companyDao;

    @Override
    public BaseResponse insert(InsertUserBizRequest bizRequest) {


        List<CompanyEntity> companyEntity = companyDao.selectCompany();


        Map<String, CompanyEntity> map = companyEntity.stream().collect(Collectors.toMap(CompanyEntity::getComName, Function.identity(), (key1, key2) -> key2));

        /**
         * 检查如果客户所属的公司不在数据库，就把这个公司添加到数据库
         */
        if ( map.get(bizRequest.getCompany()) == null){

            CompanyEntity entity1 = new CompanyEntity();
            entity1.setComId(UUIDUtils.getUUID());
            entity1.setComName(bizRequest.getCompany());
            entity1.setComHolding("");
            entity1.setComLocal("");
            companyDao.insert(entity1);
        }

        UserEntity entity = new UserEntity();
        entity.setName(bizRequest.getName());
        entity.setPassword(bizRequest.getPassword());
        entity.setSex(bizRequest.getSex());
        entity.setUid(UUIDUtils.getUUID());
        entity.setCompany(bizRequest.getCompany());
        userDao.insertUser(entity);
        return null;
    }
}
