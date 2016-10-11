package com.scau.util;

import com.scau.entity.Token;
import com.scau.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.impl.JwtMap;
import io.jsonwebtoken.impl.crypto.MacProvider;

import java.security.Key;
import java.util.Date;
import java.util.Map;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/10/10
 * @Time: 22:59
 */
public class TokenUtils {
    public static final byte[] SECRET="ffjaslkfjqworuy2qoruoqujfoqwjhdfofafa".getBytes();
    /**
     * initialize data for header
     * {
     * 		"alg":"HS256",
     * 		"type":"JWT"
     * }
     */
    private static final Key KEY = MacProvider.generateKey();
    private static final String ISS="beyondboy";
    /**
     * create a token
     {
     "iss": "John Wu JWT",
     "iat": 1441593502,
     "exp": 1441594722,
     "aud": "www.example.com",
     "sub": "jrocket@example.com",
     "from_user": "B",
     "target_user": "A"
     }
     iss: 该JWT的签发者
     sub: 该JWT所面向的用户
     aud: 接收该JWT的一方
     exp(expires): 什么时候过期，这里是一个Unix时间戳
     iat(issued at): 在什么时候签发的
     * @return
     */
    public  static Token createToken(User user){
        final Map<String,Object> claims=new JwtMap();
        final Token token=new Token();
        final Date date=new Date();
        claims.put("id",user.getUserId());
        claims.put("aud",user.getUserNickname());
        claims.put("iss",ISS);
        claims.put("iat",date.getTime());
        final String tokenString= Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512,KEY).compact();
        token.setUserId(user.getUserId());
        token.setUserToken(tokenString);
        return token;
    }

    public static boolean verifyToken(String token){
        try {

            Jwts.parser().setSigningKey(KEY).parseClaimsJws(token);
            //OK, we can trust this JWT
            return true;

        } catch (SignatureException e) {
            return false;
            //don't trust the JWT!
        }
    }
}
