package com.scau.controller;

import com.scau.common.constants.ParamKeys;
import com.scau.dto.PageInfo;
import com.scau.dto.Result;
import com.scau.entity.NoticeInfo;
import com.scau.service.NoticeServer;
import com.scau.util.ResultUtils;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    public Result addnoticeInfo(NoticeInfo noticeInfo){
        noticeServer.addNotice(noticeInfo);
        return ResultUtils.SuccessResult;
    }
    @RequestMapping(value = "/notice/getList",method = RequestMethod.POST)
    @ResponseBody
    public Result getnoticeInfo(@RequestBody Map<String,Integer> params){
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

    @RequestMapping(value = "/notice/show",method = RequestMethod.GET)
    public String shownotice(){
        return "showNotice";
    }

    /**根据条件查询语句*/
    @RequestMapping("/notice/queryCondition")
    @ResponseBody
    public List<NoticeInfo> queryCondition(@Param("field")String field, @Param("condition")String condition) {
        List<NoticeInfo> noticeInfos=noticeServer.queryByCdn(field,condition);
        logger.debug("noticeInfos:{}",noticeInfos);
        return noticeInfos;
    }

    @RequestMapping(value = "/notice/getCount")
    @ResponseBody
    public int getCount(){
        final int total=noticeServer.getTotal();
        logger.debug("total:{}",total);
        return total;
    }

    @RequestMapping(value = "/notice/getAllNotice")
    @ResponseBody
    public List<NoticeInfo> getAllnotice(){
        return noticeServer.getAllNotice();
    }

    @RequestMapping(value = "/notice/page")
    @ResponseBody
    public List<NoticeInfo> getnoticePage(@Param("start")int start,@Param("end")int end){
        return noticeServer.getLimitNotcie(start,end);
    }

    @RequestMapping(value = "/notice/delete")
    public String deletenotice(@RequestParam int noticeId){
        final int deleteId=noticeServer.delNotice(noticeId);
        logger.debug("deleteId:{}",deleteId);
        return "redirect:/notice/show";
    }
}
