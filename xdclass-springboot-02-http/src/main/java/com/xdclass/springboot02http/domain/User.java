package com.xdclass.springboot02http.domain;

/**
 *
 **/
public class User {
    private int age;
    private String pwd;
    private String phone;

    public User() {
    }

    public User(int age, String pwd, String phone) {
        this.age = age;
        this.pwd = pwd;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
