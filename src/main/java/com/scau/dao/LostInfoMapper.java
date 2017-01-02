package com.scau.dao;

import com.scau.entity.LostInfo;
import com.scau.entity.LostInfoWithBLOBs;

public interface LostInfoMapper {
    int deleteByPrimaryKey(Long lostId);

    int insert(LostInfoWithBLOBs record);

    int insertSelective(LostInfoWithBLOBs record);

    LostInfoWithBLOBs selectByPrimaryKey(Long lostId);

    int updateByPrimaryKeySelective(LostInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LostInfoWithBLOBs record);

    int updateByPrimaryKey(LostInfo record);
}