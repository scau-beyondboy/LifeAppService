package com.scau.controller;

import com.scau.dto.Result;
import com.scau.entity.LostInfoWithBLOBs;
import com.scau.service.ClubService;
import com.scau.service.LostService;
import com.scau.util.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/12/29
 * @Time: 23:34
 */
@Controller
public class LostController {
    Logger logger = LoggerFactory.getLogger(ClubService.class);
    @Autowired
    private LostService mLostService;
    @RequestMapping(value = "lost/add",method = RequestMethod.POST)
    @ResponseBody
    public Result addLost(@RequestBody  LostInfoWithBLOBs lostInfo){
        mLostService.addLostInfo(lostInfo);
        return ResultUtils.SuccessResult;
    }
}
