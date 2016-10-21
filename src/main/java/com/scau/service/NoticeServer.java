package com.scau.service;

import com.scau.dao.NoticeInfoMapper;
import com.scau.dto.PageInfo;
import com.scau.entity.NoticeInfo;
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

    public PageInfo getNoticeList(final int pageAccount, int pageSize){
        final int star=(pageAccount-1)*pageSize;
        final int total=getTotal();
        if(star>total){
            return null;
        }
        if(star+pageSize>total){
            pageSize=total-star;
        }
        final PageInfo<NoticeInfo> pageInfo =new PageInfo<NoticeInfo>();
        pageInfo.setCount(total);
        pageInfo.setPageAccount(pageAccount);
        pageInfo.setPageSize(pageSize);
        List<NoticeInfo> noticeInfos=noticeInfoMapper.getPartNoticeList(star,pageSize);
        pageInfo.setData(noticeInfos);
        return pageInfo;
    }
    public int getTotal(){
        return noticeInfoMapper.getTotal();
    }
}
