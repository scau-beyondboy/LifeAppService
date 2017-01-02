package com.scau.controller;

import com.scau.dto.Result;
import com.scau.entity.PickUpInfoWithBLOBs;
import com.scau.service.PickUpService;
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
 * @Data: 2017/1/2
 * @Time: 14:09
 */
@Controller
public class PickUpController {
    Logger logger = LoggerFactory.getLogger(PickUpController.class);
    @Autowired
    private PickUpService mPickupService;
    @RequestMapping(value = "pickup/add",method = RequestMethod.POST)
    @ResponseBody
    public Result addLost(@RequestBody PickUpInfoWithBLOBs upInfoWithBLOBs){
        mPickupService.addPickUpInfo(upInfoWithBLOBs);
        return ResultUtils.SuccessResult;
    }
}
