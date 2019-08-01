package com.xdclass.springboot09redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBoot09RedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot09RedisApplication.class, args);
	}

}
