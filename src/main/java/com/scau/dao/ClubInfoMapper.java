package com.scau.dao;

import com.scau.entity.ClubInfo;
import org.apache.ibatis.annotations.Param;

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
    List<ClubInfo> queryByCdn(@Param("field")String field, @Param("condition")String condition);
    List<ClubInfo> getTotalClubList();
    List<ClubInfo> getLimitClub(@Param("start")int start, @Param("end")int end);
}