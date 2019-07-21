package com.xdclass.springboot08mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xdclass.springboot08mybatis.mapper")
public class Springboot08MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot08MybatisApplication.class, args);
	}

}
