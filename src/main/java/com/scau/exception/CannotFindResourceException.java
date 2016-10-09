package com.scau.exception;

/**
 * Created by dhh on 2016/8/17.
 */
public class CannotFindResourceException extends RuntimeException{

    public CannotFindResourceException() {
        super("there is not resource find from database");
    }
}
