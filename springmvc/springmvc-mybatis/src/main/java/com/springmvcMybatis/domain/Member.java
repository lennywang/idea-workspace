package com.springmvcMybatis.domain;

import java.util.Date;

/**
 * @ClassName Member
 * @Description TODO
 * @Author wll
 * @Date 2019/3/29 22:19
 * @Version 1.0
 **/
public class Member {
    private String code;
    private String name;
    private Integer age;
    private Date birth;

    public Member(String code, String name, Integer age, Date birth) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
