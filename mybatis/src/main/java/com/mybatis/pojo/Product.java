package com.mybatis.pojo;

import java.io.Serializable;

/**
 * @ClassName Product
 * @Description TODO
 * @Author wll
 * @Date 2019/3/30 15:14
 * @Version 1.0
 **/
public class Product implements Serializable {
    private Integer prodNo;
    private String prodName;

    public Integer getProdNo() {
        return prodNo;
    }

    public void setProdNo(Integer prodNo) {
        this.prodNo = prodNo;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodNo=" + prodNo +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}
