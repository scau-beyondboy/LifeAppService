package com.scau.dao;

import com.scau.entity.Token;

public interface TokenMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(Token record);

    int insertSelective(Token record);

    Token selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}