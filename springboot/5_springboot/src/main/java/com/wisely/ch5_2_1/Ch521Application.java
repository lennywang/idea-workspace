package com.wisely.ch5_2_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {CodecsAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class Ch521Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch521Application.class, args);
    }
}
