package com.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName User
 * @Description TODO
 * @Author wll
 * @Date 2019/4/7 21:22
 * @Version 1.0
 **/
@Component("user")
@Scope("prototype")
public class User {
    private String name;
    private Integer age;
    private Car car;

    public User() {
        System.out.println("User类空参构造方法！！");
    }

    public User(String name, Car car) {
        System.out.println("User(String name, Car car)");
        this.name = name;
        this.car = car;
    }

    public User(Car car,String name) {
        System.out.println("User(Car car,String name)");
        this.name = name;
        this.car = car;
    }

    public User(Integer name, Car car) {
        System.out.println("User(Integer name, Car car)");
        this.name = name+"";
        this.car = car;
    }

    public String getName() {
        return name;
    }

    @Value("王路路")
    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    //注解只有一个属性，且该属性为Value时，可省略属性名
    @Value(value = "30")
    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    @Resource(name = "car")
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    public void init(){
        System.out.println("我是初始化方法！");
    }

    public void destory(){
        System.out.println("我是销毁方法！");
    }
}
