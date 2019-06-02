package com.spring.service;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author wll
 * @Date 2019/4/27 21:39
 * @Version 1.0
 **/
public interface AccountService {

    //转账方法
    void transfer(Integer from,Integer to,Double money);
}
