package com.xdclass.springboot.domain;

public class SortA implements Comparable<SortA> {
     
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
 
    @Override
    public int compareTo(SortA a) {
        //       return a.getOrder()-this.order; //升序
        //      return this.order-a.getOrder(); //倒序
        //      return this.order.compareTo(a.getOrder());//升序
        return a.getOrder().compareTo(this.order);//倒序
    }
 
 
}