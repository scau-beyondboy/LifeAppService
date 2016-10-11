package com.scau.controller;

import com.scau.common.constants.ParamKeys;
import com.scau.dto.Result;
import com.scau.entity.Token;
import com.scau.entity.User;
import com.scau.service.TokenService;
import com.scau.service.UserService;
import com.scau.util.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/10/11
 * @Time: 13:42
 */
@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;
    @RequestMapping(value = "user/register",method = RequestMethod.POST)
    public Result userRegister(@RequestBody User user){
        boolean isRegister=userService.register(user);
        if(isRegister){
            //create a user token
            final Token token=tokenService.createToken(user);
            return ResultUtils.SuccessResultWithData(token);
        }else{
            return ResultUtils.NickNameExistResult;
        }
    }
    @RequestMapping(value = "user/login",method = RequestMethod.POST)
    public Result userLogin(@RequestBody Map<String,String> params){
        final String nickName=params.get(ParamKeys.NICKNAME);
        final String password=params.get(ParamKeys.PASSWORD);
        final Token token=userService.login(nickName,password);
        if(token!=null) {
            return ResultUtils.SuccessResultWithData(token);
        } else {
            return ResultUtils.InvalidNickNameOrPasswordResult;
        }
    }
}
