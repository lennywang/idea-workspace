package com.xdclass.springboot.domain;

import java.io.Serializable;

/**
 * 响应结果类
 **/
public class JsonData implements Serializable {

    /**
     * 状态码 0：成功 ，1：处理中，-1：失败
     **/
    private Integer code;

    /**
     * 数据
     **/
    private  Object data;

    /**
     * 描述
     **/
    private String msg;

    public JsonData() {
    }

    public JsonData(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static JsonData buildSuccess(){
        return new JsonData(0,null,null);
    }

    public static JsonData buildSuccess(Object obj){
        return new JsonData(0,obj,null);
    }

    public static JsonData buildSuccess(Object obj,String msg){
        return new JsonData(0,obj,msg);
    }

    public static JsonData buildSuccess(int code,Object object){
        return new JsonData(code,object,null);
    }

    public static  JsonData buildError(String msg){
        return new JsonData(-1,null,msg);
    }

    public static JsonData buildError(Object object,String msg){
        return  new JsonData(-1,object,msg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
