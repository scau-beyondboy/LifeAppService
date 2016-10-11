package com.scau.dao;

import com.scau.entity.UserDetail;

public interface UserDetailMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    UserDetail selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
}