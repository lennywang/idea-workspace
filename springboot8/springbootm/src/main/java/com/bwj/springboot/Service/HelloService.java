package com.bwj.springboot.Service;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author wll
 * @Date 2019/5/4 19:10
 * @Version 1.0
 **/
public class HelloService {
    private String msg;
    public String sayHello(){
        return "Hello"+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
