package com.springcloud.eureka_client.domain;

/**
 * @ClassName Product
 * @Description TODO
 * @Author wll
 * @Date 2019/6/2 21:38
 * @Version 1.0
 **/
public class Product {

    private int id;

    private String name;

    private int price;

    private int store;

    public Product() {
    }

    public Product(int id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
