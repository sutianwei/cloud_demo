package com.awei.cloud.dao;


import com.awei.cloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 梁云亮
 * @Date 2020/4/21 16:58
 * @Description:
 */   
@Mapper
public interface UserMapper {

    User selectByPrimaryKey(Integer id);

    List<User> selectByUsername(@Param("username")String username);
}