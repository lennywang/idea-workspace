package com.bwj.springboot02.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoService
 * @Description TODO
 * @Author wll
 * @Date 2019/5/22 1:14
 * @Version 1.0
 **/
@Service
public class DemoService {

    @Value("其他类的属性")
    private String anthor;

    public String getAnthor() {
        return anthor;
    }

    public void setAnthor(String anthor) {
        this.anthor = anthor;
    }
}
