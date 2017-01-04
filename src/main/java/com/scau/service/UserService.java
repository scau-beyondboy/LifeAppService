package com.scau.service;

import com.scau.dao.TokenMapper;
import com.scau.dao.UserDetailMapper;
import com.scau.dao.UserMapper;
import com.scau.entity.Token;
import com.scau.entity.User;
import com.scau.entity.UserDetail;
import com.scau.util.PasswordUtils;
import com.scau.util.TokenUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/10/11
 * @Time: 13:03
 */
@Service
public class UserService {
    @Autowired
    UserMapper userDao;
    @Autowired
    TokenMapper tokenMapper;
    @Autowired
    UserDetailMapper detailMapper;
    Logger logger = LoggerFactory.getLogger(UserService.class);
    public boolean register(User user){
        logger.debug("user_info:{}",user);
        if(null!=userDao.selectByNickName(user.getUserNickname())){
            logger.info("process user fail, user nickName {} has existed",user.getUserNickname());
            return false;
        }
        try {
            String passwordHash= PasswordUtils.createHash(user.getUserPassword());
            user.setUserPassword(passwordHash);
        } catch (Exception e) {
           logger.error("Create passwordHash error:{}",e.getMessage());
            return false;
        }
        userDao.insert(user);
        return true;
    }

    public Token login(String nickName,String password){
        User user=userDao.selectByNickName(nickName);
        if(null == user) {
            logger.info("user nickName {} not exist", nickName);
            return null;
        }
        try {
            if(!PasswordUtils.validatePassword(password,user.getUserPassword())){
                logger.info("user nickName {} password not correct", nickName);
                return null;
            }
        } catch (Exception e) {
            logger.error("validate Password error:{}",e.getMessage());
            return null;
        }
        logger.info("user nickName {} login pass", nickName);
        final Token token=TokenUtils.createToken(user);
        tokenMapper.updateByPrimaryKey(token);
        return token;
    }

    public UserDetail upLoadInfo(UserDetail userDetail){
        logger.debug("user_Detail:{}",userDetail);
        if(null!=detailMapper.selectByPrimaryKey(userDetail.getUserId())){
            logger.info("process user fail, user Id {} has existed",userDetail.getUserId());
            return detailMapper.selectByPrimaryKey(userDetail.getUserId());
        }
        detailMapper.insert(userDetail);
        return userDetail;
    }

    public UserDetail getUsrInfo(final long userId){
        logger.debug("userId:{}",userId);
        final UserDetail userDetail=detailMapper.selectByPrimaryKey(userId);
        logger.info("userDetail:{}",userDetail.toString());
        return userDetail;
    }

    public UserDetail updateInfo(UserDetail userDetail){
        logger.debug("user_Detail:{}",userDetail);
        if(null!=detailMapper.selectByPrimaryKey(userDetail.getUserId())){
            logger.info("user Id {} has existed",userDetail.getUserId());
            detailMapper.updateByPrimaryKey(userDetail);
            return userDetail;
        }
        detailMapper.insert(userDetail);
        return userDetail;
    }
}
