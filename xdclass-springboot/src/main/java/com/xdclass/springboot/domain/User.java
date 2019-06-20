package com.xdclass.springboot.domain;

import java.util.Date;

/**
 *
 **/
public class User {
    private Integer id;

    private String name;

    private String phone;

    private Date datetime;

    private int age;

    public User() {
    }

    public User(Integer id, String name, String phone, Date datetime, int age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.datetime = datetime;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
