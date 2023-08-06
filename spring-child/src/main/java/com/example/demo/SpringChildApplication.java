package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:dbconfig.properties")
@SpringBootApplication
public class SpringChildApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringChildApplication.class, args);
	}

}
