package com.spring.model;

/**
 * @ClassName User
 * @Description TODO
 * @Author wll
 * @Date 2019/4/7 21:22
 * @Version 1.0
 **/
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

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

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
