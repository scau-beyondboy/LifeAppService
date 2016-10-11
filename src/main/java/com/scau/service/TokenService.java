package com.scau.service;

import com.scau.dao.TokenMapper;
import com.scau.entity.Token;
import com.scau.entity.User;
import com.scau.util.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/10/11
 * @Time: 14:57
 */
@Service
public class TokenService {
    @Autowired
    TokenMapper tokenMapper;
    public Token createToken(User user){
        final Token token= TokenUtils.createToken(user);
        tokenMapper.insert(token);
        return token;
    }
}
