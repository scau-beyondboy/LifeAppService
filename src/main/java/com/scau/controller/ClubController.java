package com.scau.controller;

import com.scau.common.constants.ParamKeys;
import com.scau.dto.ClubPage;
import com.scau.dto.Result;
import com.scau.entity.ClubInfo;
import com.scau.service.ClubService;
import com.scau.util.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/10/17
 * @Time: 23:54
 */
@Controller
public class ClubController {
    Logger logger = LoggerFactory.getLogger(ClubService.class);
    @Autowired
    private  ClubService clubService;
    @RequestMapping(value = "/club/add",method = RequestMethod.GET)
    public String addClub(){
        return "addClub";
    }
    @RequestMapping(value = "/club/addInfo",method = RequestMethod.POST)
    @ResponseBody
    public Result addClubInfo(ClubInfo clubInfo){
        clubService.addClub(clubInfo);
        return ResultUtils.SuccessResult;
    }

    @RequestMapping(value = "/club/getList",method = RequestMethod.POST)
    @ResponseBody
    public Result getClubInfo(@RequestBody Map<String,Integer> params){
        final int pageAccount=params.get(ParamKeys.PAGEACCOUNT);
        final int pageSize=params.get(ParamKeys.PAGESIZE);
        final ClubPage clubPage=clubService.getClubList(pageAccount,pageSize);
        return ResultUtils.SuccessResultWithData(clubPage);
    }
}
