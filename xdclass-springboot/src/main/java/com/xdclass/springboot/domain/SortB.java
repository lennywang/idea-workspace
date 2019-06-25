package com.xdclass.springboot.domain;

public class SortB  {
     
    private String name;
    private Integer order;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getOrder() {
        return order;
    }
 
    public void setOrder(Integer order) {
        this.order = order;
    }
 
    @Override
    public String toString() {
        return "name:" + name + "--order:" + order;
    }
 
 
 
}