package com.awei.cloud.dao;

import com.awei.cloud.entity.CompanyEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

@Repository
public interface CompanyDao {

    int insert(CompanyEntity entity);

    void delete(@Param("ids") Collection<String> ids);

    CompanyEntity getCompany(@Param("comId") String comId);
}
