package com.scau.service;

import com.scau.dao.LostInfoMapper;
import com.scau.entity.LostInfo;
import com.scau.entity.LostInfoWithBLOBs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/12/29
 * @Time: 23:37
 */
@Service
public class LostService {
    @Autowired
    private LostInfoMapper mLostInfoMapper;
    Logger logger = LoggerFactory.getLogger(LostService.class);
    public void addLostInfo(LostInfoWithBLOBs lostInfo){
        logger.info("add lostInfo:{}",lostInfo.toString());
        mLostInfoMapper.insert(lostInfo);
    }
}
