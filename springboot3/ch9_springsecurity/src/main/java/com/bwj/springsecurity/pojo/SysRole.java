package com.bwj.springsecurity.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * create by jack 2017/10/18
 */
@Entity
public class SysRole {
    @Id
    @GeneratedValue//(strategy= GenerationType.AUTO)
    private Integer id;
    //角色名称
    private String name;

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
}
