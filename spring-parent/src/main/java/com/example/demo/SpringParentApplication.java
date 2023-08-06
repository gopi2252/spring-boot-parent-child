package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:dbconfig.properties")
@SpringBootApplication
public class SpringParentApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringParentApplication.class, args);
	}
	
//	@Autowired
//	private CreditAccountRepo accountRepo;
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(accountRepo.findById(1234l).get().toString());
//	}
}
