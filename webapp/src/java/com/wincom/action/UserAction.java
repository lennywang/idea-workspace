package com.wincom.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wincom.model.UserEntity;
import com.wincom.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {

    private UserEntity userEntity;

    @Resource
    private UserService userService;

    public UserEntity getUser(){
        return userEntity;
    }
    public String m1(){
        userEntity=userService.getUser(1);
        System.out.println(userEntity.getUname());
        //https://blog.csdn.net/sunxiaoju/article/details/81007709
        return SUCCESS;
    }

    public String saveUser(){
        UserEntity user=new UserEntity();
        user.setUname("事务已提交");
        userService.saveUser(user);
        return SUCCESS;
    }

}
