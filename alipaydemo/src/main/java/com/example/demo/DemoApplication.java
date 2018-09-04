package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@Configuration
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("******************spring application*******************");
	}

	@RequestMapping("hello")
	@ResponseBody
	public String hello(){
		return "hello world！";
	}

	@RequestMapping("hello2")
	@ResponseBody
	public String hello2(){
		return "hello world！";
	}
}
