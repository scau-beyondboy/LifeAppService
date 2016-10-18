package com.scau.util;

import com.scau.dto.Result;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/10/11
 * @Time: 13:53
 */
public class ResultUtils {
    public static final Result SuccessResult = new Result(true, "success", 200);
    public static final Result NotLoginResult = new Result(true, "not login", 401);
    public static final Result InvalidPasswordResult = new Result(true, "invalid current password", 400);
    public static final Result NickNameExistResult = new Result(true, "nickname exist", 402);
    public static final Result InvalidNickNameOrPasswordResult = new Result(true, "nickname not exist or password error", 401);
    public static <T> Result SuccessResultWithData(T data) {
        return new Result(true, "success", 200, data);
    }
}
