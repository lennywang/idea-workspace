package com.xdclass.springboot04exception.ch4_04;

import com.xdclass.springboot04exception.domain.MyException;
import com.xdclass.springboot04exception.domain.Settings;
import com.xdclass.springboot04exception.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;
import java.util.Date;

/**
 *
 **/
@RestController
public class ExceptionController {

    @Autowired
    private Settings settings;

    @RequestMapping("/api/v1/test_exception")
    private Object index() {
        String tmp = "域名：{0},姓名：{1}";
        String setring = MessageFormat.format(tmp, settings.getDomain(), settings.getName());
        System.out.println(setring);
        int i = 1 / 0;
        return new User(1, "sdkf", "1000", new Date());
    }

    @RequestMapping("/api/v1/test_myexception")
    private Object test()
    {
        throw new MyException("499","my ext 异常");
    }

}