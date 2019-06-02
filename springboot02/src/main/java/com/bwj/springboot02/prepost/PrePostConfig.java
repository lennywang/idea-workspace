package com.bwj.springboot02.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName PrePostConfig
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 0:47
 * @Version 1.0
 **/
@Configuration
@ComponentScan("com.bwj.springboot02.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
      return  new JSR250WayService();
    }
}
