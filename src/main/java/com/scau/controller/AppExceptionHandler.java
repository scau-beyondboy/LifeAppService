package com.scau.controller;

import com.scau.dto.Result;
import com.scau.exception.CannotFindResourceException;
import com.scau.exception.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: beyondboy
 * @Gmail: xuguoli.scau@gamil.com
 * @Data: 2016/10/9
 * @Time: 15:26
 */
@ControllerAdvice
public class AppExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 系统错误
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public Result runtimeExceptionHandler(RuntimeException e) {
        logger.error(e.getMessage(),e);
        return new Result(false,"fail",500);
    }

    /**
     * 缺少参数
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Result missParameter(Exception e) {
        logger.error(e.getMessage(),e);
        return new Result(false,"fail",400);
    }

    /**
     * 数据库找不到对应资源
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(CannotFindResourceException.class)
    public Result missResource(CannotFindResourceException e) {
        logger.error(e.getMessage(),e);
        return new Result(false,"fail",404);
    }

    /**
     * 无权限
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(UnauthorizedException.class)
    public Result unauthorizedException(UnauthorizedException e) {
        logger.error(e.getMessage(),e);
        return new Result(false,"fail",401);
    }
}
