package com.scau.dao;

import com.scau.entity.PickUpInfo;
import com.scau.entity.PickUpInfoWithBLOBs;

public interface PickUpInfoMapper {
    int deleteByPrimaryKey(Long pickupId);

    int insert(PickUpInfoWithBLOBs record);

    int insertSelective(PickUpInfoWithBLOBs record);

    PickUpInfoWithBLOBs selectByPrimaryKey(Long pickupId);

    int updateByPrimaryKeySelective(PickUpInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PickUpInfoWithBLOBs record);

    int updateByPrimaryKey(PickUpInfo record);
}