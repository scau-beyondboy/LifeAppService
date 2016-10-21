package com.scau.dao;

import com.scau.entity.NoticeInfo;

import java.util.List;

public interface NoticeInfoMapper {
    int deleteByPrimaryKey(Long noticeId);

    int insert(NoticeInfo record);

    int insertSelective(NoticeInfo record);

    NoticeInfo selectByPrimaryKey(Long noticeId);

    int updateByPrimaryKeySelective(NoticeInfo record);

    int updateByPrimaryKeyWithBLOBs(NoticeInfo record);

    int updateByPrimaryKey(NoticeInfo record);

    int getTotal();

    List<NoticeInfo> getPartNoticeList(Integer pageCount,Integer pageSize);
}