package com.scau.dto;

/**
 * Created by dhh on 2016/7/1.
 */
public class Result<T> {

    private boolean status;
    private String msg;
    private int code;
    private T data;

    public Result() {
    }

    public Result(boolean status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Result(boolean status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Result(boolean status, String msg, int code) {
        this.status = status;
        this.msg = msg;
        this.code = code;
    }

    public Result(boolean status, String msg, int code, T data) {
        this.status = status;
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
