package com.scau.service;

import com.scau.dao.PickUpInfoMapper;
import com.scau.dto.PageInfo;
import com.scau.entity.LostInfoWithBLOBs;
import com.scau.entity.NoticeInfo;
import com.scau.entity.PickUpInfoWithBLOBs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2017/1/2
 * @Time: 14:11
 */
@Service
public class PickUpService {
    @Autowired
    private PickUpInfoMapper pickUpInfoMapper;
    Logger logger = LoggerFactory.getLogger(PickUpService.class);
    public void addPickUpInfo(PickUpInfoWithBLOBs pickUpInfo){
        logger.info("add pickUpInfo:{}",pickUpInfo.toString());
        pickUpInfoMapper.insert(pickUpInfo);
    }

    public PageInfo getPickList(final int pageStart, int pageEnd){
        final int total=getTotal();
        final PageInfo<PickUpInfoWithBLOBs> pageInfo =new PageInfo<PickUpInfoWithBLOBs>();
        pageEnd = pageEnd -pageStart;
        pageInfo.setCount(total);
        pageInfo.setPageAccount(pageStart);
        pageInfo.setPageSize(pageEnd);
        List<PickUpInfoWithBLOBs> pickInfos=pickUpInfoMapper.getPartPickList(pageStart, pageEnd);
        pageInfo.setData(pickInfos);
        return pageInfo;
    }
    
    public int getTotal(){
        return pickUpInfoMapper.getTotal();
    }
}
