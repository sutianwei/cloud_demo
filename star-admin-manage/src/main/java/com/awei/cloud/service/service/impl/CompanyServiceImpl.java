package com.awei.cloud.service.service.impl;

import com.awei.cloud.dao.CompanyDao;
import com.awei.cloud.entity.CompanyEntity;
import com.awei.cloud.service.request.InsertCompanyBizRequest;
import com.awei.cloud.service.service.CompanyService;
import com.awei.cloud.util.UUIDUtils;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public void insert(InsertCompanyBizRequest request) {

        CompanyEntity entity = new CompanyEntity();
        entity.setComHolding(request.getComHolding());
        entity.setComLocal(request.getComLocal());
        entity.setComName(request.getComName());
        String comId = UUIDUtils.getUUID();
        entity.setComId(comId);
        companyDao.insert(entity);



    }
}
