package com.scau.dao;

import com.scau.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    User selectByNickName(String nickName);
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}