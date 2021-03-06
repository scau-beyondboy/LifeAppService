package com.scau.service;

import com.scau.dao.NoticeInfoMapper;
import com.scau.dto.PageInfo;
import com.scau.entity.ClubInfo;
import com.scau.entity.NoticeInfo;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/10/20
 * @Time: 1:31
 */
@Service
public class NoticeServer {
    @Autowired
    private NoticeInfoMapper noticeInfoMapper;
    Logger logger = LoggerFactory.getLogger(NoticeServer.class);
    public void addNotice(NoticeInfo noticeInfo){
        logger.info("add notice:{}",noticeInfo.toString());
        noticeInfoMapper.insert(noticeInfo);
    }

    public PageInfo getNoticeList(final int pageStart, int pageEnd){
//        final int star=(pageAccount-1)*pageEnd;
        final int total=getTotal();
//        if(star>total){
//            return null;
//        }
//        if(star+pageEnd>total){
//            pageEnd=total-star;
//        }
        final PageInfo<NoticeInfo> pageInfo =new PageInfo<NoticeInfo>();
        pageEnd = pageEnd -pageStart;
        pageInfo.setCount(total);
        pageInfo.setPageAccount(pageStart);
        pageInfo.setPageSize(pageEnd);
        List<NoticeInfo> noticeInfos=noticeInfoMapper.getPartNoticeList(pageStart, pageEnd);
        pageInfo.setData(noticeInfos);
        return pageInfo;
    }
    public int getTotal(){
        return noticeInfoMapper.getTotal();
    }

    public List<NoticeInfo> queryByCdn(@Param("field") String field, @Param("condition") String condition) {
        return  noticeInfoMapper.queryByCdn(field,condition);
    }

    public List<NoticeInfo> getAllNotice(){
        return noticeInfoMapper.getTotalNoticeList();
    }

    public List<NoticeInfo> getLimitNotcie(final int pageStart, int pageEnd){
        return noticeInfoMapper.getLimitNotice(pageStart,pageEnd);
    }

    public int delNotice(final long id){
        return noticeInfoMapper.deleteByPrimaryKey(id);
    }
}
