package com.scau.controller;

import com.scau.entity.Token;
import com.scau.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2017/3/27
 * @Time: 23:03
 */
@Controller
public class AmdinController {
    Logger logger = LoggerFactory.getLogger(AmdinController.class);
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/user/admin",method = RequestMethod.GET)
    public String enterAdmin(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies=request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            logger.debug("enterAdmin:Cookies{}",cookies[i].getValue());
            response.addCookie(cookies[i]);
        }
        return "admin";
    }

    @RequestMapping(value = "/user/loginhandle",method = RequestMethod.POST)
    public String loginhandle(ModelMap modelMap, @RequestParam(value ="username")String username, @RequestParam(value="password")String password,HttpServletResponse response)
    {
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password))
        {
            modelMap.addAttribute("error","用户名和密码都不能为空");
            return "redirect:/admin/loginfail";
        }
        Token token=userService.login(username,password);
        if(token!=null)
        {
            Cookie cookie=new Cookie("token",token.toString());
            cookie.setMaxAge(3600000);
            response.addCookie(cookie);
            return "redirect:/user/admin";
        }
        modelMap.addAttribute("error","不存在该用户");
        return "redirect:/admin/loginfail";
    }

    @RequestMapping(value = "/admin/loginfail",method = RequestMethod.GET)
    public String loginFail(HttpServletRequest request,HttpServletResponse response){
        return "loginfail";
    }

    @RequestMapping(value = "/admin/login")
    public String login(HttpServletRequest request,HttpServletResponse response)
    {
        Cookie[] cookies=request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            logger.debug("login:Cookies{}",cookies[i].getValue());
            response.addCookie(cookies[i]);
        }
        return "login";
    }
}
