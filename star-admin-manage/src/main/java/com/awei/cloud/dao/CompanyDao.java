package com.awei.cloud.dao;

import com.awei.cloud.entity.CompanyEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao {

    int insert (CompanyEntity  entity);

}
