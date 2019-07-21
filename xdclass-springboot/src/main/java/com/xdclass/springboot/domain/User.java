package com.xdclass.springboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 *
 **/
public class User {
    private Integer id;

    private String name;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("account")
    private String phone;

    @JsonFormat(
            pattern = "yyyy-MM-dd hh:mm:ss",
            locale = "zh",
            timezone = "GMT+8"
    )
    private Date datetime;

    @JsonIgnore
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
