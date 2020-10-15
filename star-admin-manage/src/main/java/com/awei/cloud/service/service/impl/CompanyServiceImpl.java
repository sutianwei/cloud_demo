package com.awei.cloud.service.service.impl;

import com.awei.cloud.dao.CompanyDao;
import com.awei.cloud.entity.CompanyEntity;
import com.awei.cloud.service.request.DeleteCompanyBizRequest;
import com.awei.cloud.service.request.GetCompanyBizRequest;
import com.awei.cloud.service.request.InsertCompanyBizRequest;
import com.awei.cloud.service.service.CompanyService;
import com.awei.cloud.util.RedisUtil;
import com.awei.cloud.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void insert(InsertCompanyBizRequest request) {

        CompanyEntity entity = new CompanyEntity();
        entity.setComHolding(request.getComHolding());
        entity.setComLocal(request.getComLocal());
        entity.setComName(request.getComName());
        String comId = UUIDUtils.getUUID();
        entity.setComId(comId);
        redisUtil.set(entity.getComId(), entity);
        companyDao.insert(entity);
    }

    @Override
    public void deleteCompany(DeleteCompanyBizRequest bizRequest) {
        companyDao.delete(bizRequest.getIds());
    }


    @Override
    public CompanyEntity getCompany(GetCompanyBizRequest bizRequest) {


        Object o = redisUtil.get(bizRequest.getComId());
        if (o != null) {
            return (CompanyEntity) o;
        }

        CompanyEntity entity = companyDao.getCompany(bizRequest.getComId());
        redisUtil.set(entity.getComId(), entity);
        return entity;
    }
}
