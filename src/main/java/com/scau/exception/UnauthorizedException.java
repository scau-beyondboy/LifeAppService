package com.scau.exception;

/**
 * Created by dhh on 2016/8/12.
 */
public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException() {
        super("you have no authority");
    }
}
