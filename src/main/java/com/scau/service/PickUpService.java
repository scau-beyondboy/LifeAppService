package com.scau.service;

import com.scau.dao.PickUpInfoMapper;
import com.scau.entity.LostInfoWithBLOBs;
import com.scau.entity.PickUpInfoWithBLOBs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
