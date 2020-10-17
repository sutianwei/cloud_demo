package com.awei.cloud.dao;

import com.awei.cloud.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface userDao {


    void insertUser( UserEntity  entity);



}
