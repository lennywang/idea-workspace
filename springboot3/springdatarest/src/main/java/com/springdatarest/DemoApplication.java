package com.springdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.springdatarest")
public class DemoApplication {
//,exclude = DataSourceAutoConfiguration.class
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
