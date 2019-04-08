package com.spring.model;

/**
 * @ClassName Car
 * @Description TODO
 * @Author wll
 * @Date 2019/4/7 20:36
 * @Version 1.0
 **/
public class Car {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

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
