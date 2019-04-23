package com.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @ClassName Car
 * @Description TODO
 * @Author wll
 * @Date 2019/4/7 20:36
 * @Version 1.0
 **/
@Repository("car")
@Scope(value = "prototype")
public class Car {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    @Value(value = "兰博基尼")
    public void setName(String name) {
        this.name = name;
    }


    public String getColor() {
        return color;
    }

    @Value(value = "黄色")
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
