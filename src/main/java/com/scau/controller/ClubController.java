package com.scau.controller;

import com.scau.common.constants.ParamKeys;
import com.scau.dto.PageInfo;
import com.scau.dto.Result;
import com.scau.entity.ClubInfo;
import com.scau.service.ClubService;
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
 * @Data: 2016/10/17
 * @Time: 23:54
 */
@Controller
public class ClubController {
    Logger logger = LoggerFactory.getLogger(ClubService.class);
    @Autowired
    private  ClubService clubService;
    @RequestMapping(value = "/club/add",method = RequestMethod.GET)
    public String addClub(@CookieValue(value ="token",defaultValue = "beyondboy")String tokenCookie){
        logger.debug("cookie:{}",tokenCookie);
        return "addClub";
    }

    @RequestMapping(value = "/club/show",method = RequestMethod.GET)
    public String showClub(@CookieValue(value ="token",defaultValue = "beyondboy")String tokenCookie){
        logger.debug("cookie:{}",tokenCookie);
        return "showClub";
    }

    @RequestMapping(value = "/club/addInfo",method = {RequestMethod.POST})
    @ResponseBody
    public Result addClubInfo(ClubInfo clubInfo){
        clubService.addClub(clubInfo);
        return ResultUtils.SuccessResult;
    }

    @RequestMapping(value = "/club/getList",method = RequestMethod.POST)
    @ResponseBody
    public Result getClubInfo(@RequestBody Map<String,Integer> params){
        final int pageStart=params.get(ParamKeys.PAGESTART);
        final int pageSize=params.get(ParamKeys.PAGESIZE);
        final PageInfo pageInfo =clubService.getClubList(pageStart,pageSize);
        return ResultUtils.SuccessResultWithData(pageInfo);
    }

    @RequestMapping(value = "/club/getTotal",method = RequestMethod.POST)
    @ResponseBody
    public Result getTotal(){
        final int total=clubService.getTotal();
        logger.debug("total:{}",total);
        return ResultUtils.SuccessResultWithData(total);
    }

    /**根据条件查询语句*/
    @RequestMapping("/club/queryCondition")
    @ResponseBody
    public List<ClubInfo> queryCondition(@Param("field")String field, @Param("condition")String condition) {
        List<ClubInfo> clubInfos=clubService.queryByCdn(field,condition);
        logger.debug("clubInfos:{}",clubInfos);
        return clubInfos;
    }

    @RequestMapping(value = "/club/getCount")
    @ResponseBody
    public int getCount(){
        final int total=clubService.getTotal();
        logger.debug("total:{}",total);
        return total;
    }

    @RequestMapping(value = "/club/getAllClub")
    @ResponseBody
    public List<ClubInfo> getAllClub(){
        return clubService.getAllClub();
    }

    @RequestMapping(value = "/club/page")
    @ResponseBody
    public List<ClubInfo> getClubPage(@Param("start")int start,@Param("end")int end){
        return clubService.getLimitClub(start,end);
    }

    @RequestMapping(value = "/club/delete")
    public String deleteClub(@RequestParam int clubId){
        final int deleteId=clubService.delClub(clubId);
        logger.debug("deleteId:{}",deleteId);
        return "redirect:/club/show";
    }
}
