package com.scau.controller;

import com.scau.common.constants.ParamKeys;
import com.scau.dto.PageInfo;
import com.scau.dto.Result;
import com.scau.entity.NoticeInfo;
import com.scau.service.NoticeServer;
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
 * @Data: 2016/10/20
 * @Time: 1:39
 */
@Controller
public class NoticeController {
    Logger logger = LoggerFactory.getLogger(NoticeServer.class);
    @Autowired
    private NoticeServer noticeServer;
    @RequestMapping(value = "/notice/add",method = RequestMethod.GET)
    public String addNotice(){
        return "addNotice";
    }
    @RequestMapping(value ="/notice/addinfo",method = RequestMethod.POST)
    @ResponseBody
    public Result addClubInfo(NoticeInfo noticeInfo){
        noticeServer.addNotice(noticeInfo);
        return ResultUtils.SuccessResult;
    }
    @RequestMapping(value = "/notice/getList",method = RequestMethod.POST)
    @ResponseBody
    public Result getClubInfo(@RequestBody Map<String,Integer> params){
        final int pageAccount=params.get(ParamKeys.PAGESTART);
        final int pageSize=params.get(ParamKeys.PAGESIZE);
        logger.info("pageAccount:{}    pageSize:{}",pageAccount,pageSize);
        final PageInfo pageInfo =noticeServer.getNoticeList(pageAccount,pageSize);
        return ResultUtils.SuccessResultWithData(pageInfo);
    }

    @RequestMapping(value = "/notice/getTotal",method = RequestMethod.POST)
    @ResponseBody
    public Result getTotal(){
        return ResultUtils.SuccessResultWithData(noticeServer.getTotal());
    }
}
