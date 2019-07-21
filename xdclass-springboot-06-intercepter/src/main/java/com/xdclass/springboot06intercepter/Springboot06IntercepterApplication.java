package com.xdclass.springboot06intercepter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
@ServletComponentScan
public class Springboot06IntercepterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot06IntercepterApplication.class, args);
	}

}
