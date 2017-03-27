package com.scau.service;

import com.scau.dao.ClubInfoMapper;
import com.scau.dto.PageInfo;
import com.scau.entity.ClubInfo;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/10/17
 * @Time: 23:54
 */
@Service
public class ClubService {
    @Autowired
    private ClubInfoMapper clubInfoMapper;
    Logger logger = LoggerFactory.getLogger(ClubService.class);
    public void addClub(ClubInfo clubInfo){
        logger.info("add club:{}",clubInfo.toString());
        clubInfoMapper.insert(clubInfo);
    }

    public PageInfo getClubList(final int pageStart, int pageSize){
//        final int star=(pageAccount-1)*pageSize;
        final int total=getTotal();
//        if(star>total){
//            return null;
//        }
//        if(star+pageSize>total){
//            pageSize=total-star;
//        }
        final PageInfo<ClubInfo> pageInfo =new PageInfo<ClubInfo>();
        pageSize=pageSize-pageStart;
        pageInfo.setCount(total);
        pageInfo.setPageAccount(pageStart);
        pageInfo.setPageSize(pageSize);
        List<ClubInfo> clubInfos=clubInfoMapper.getPartClubList(pageStart,pageSize);
        pageInfo.setData(clubInfos);
        return pageInfo;
    }

    public int getTotal(){
        return clubInfoMapper.getTotal();
    }

    public List<ClubInfo> queryByCdn(@Param("field") String field, @Param("condition") String condition) {
        return clubInfoMapper.queryByCdn(field,condition);
    }

    public List<ClubInfo> getAllClub(){
        return clubInfoMapper.getTotalClubList();
    }

    public List<ClubInfo> getLimitClub(final int pageStart, int pageEnd){
        return clubInfoMapper.getLimitClub(pageStart,pageEnd);
    }

    public int delClub(final long id){
        return clubInfoMapper.deleteByPrimaryKey(id);
    }
}
