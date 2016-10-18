package com.scau.dao;

import com.scau.entity.ClubInfo;

import java.util.List;

public interface ClubInfoMapper {
    int deleteByPrimaryKey(Long clubId);

    int insert(ClubInfo record);

    int insertSelective(ClubInfo record);

    ClubInfo selectByPrimaryKey(Long clubId);

    int updateByPrimaryKeySelective(ClubInfo record);

    int updateByPrimaryKeyWithBLOBs(ClubInfo record);

    int updateByPrimaryKey(ClubInfo record);

    List<ClubInfo> getPartClubList( Integer pageCount,Integer pageSize);
    int getTotal();
}