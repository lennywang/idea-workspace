package com.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @ClassName ch8Application
 * @Description TODO
 * @Author wll
 * @Date 2019/3/24 22:03
 * @Version 1.0
 **/
@SpringBootApplication
public class ch8Application {
//            @Autowired
//            PersonDao personDao;

    public static void main(String[] args) {
        SpringApplication.run(ch8Application.class, args);

    }


}
