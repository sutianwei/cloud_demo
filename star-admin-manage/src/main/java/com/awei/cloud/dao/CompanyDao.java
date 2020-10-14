package com.awei.cloud.dao;

import com.awei.cloud.entity.CompanyEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CompanyDao {

    int insert(CompanyEntity entity);

    void delete(@Param("ids") Collection<String> ids);

}
