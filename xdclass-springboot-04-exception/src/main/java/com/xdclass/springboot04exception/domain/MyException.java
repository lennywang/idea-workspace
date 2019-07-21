package com.xdclass.springboot04exception.domain;

/**
 *
 **/
public class MyException extends RuntimeException {

    private String code;

    private String message;

    public MyException(String code,String message)
    {
        this.code =code;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
