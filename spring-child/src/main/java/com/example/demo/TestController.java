package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CreditAccount;
import com.example.demo.repo.CreditAccountRepo;

@RestController
@RequestMapping("/h")
public class TestController {

	@Autowired
	private CreditAccountRepo accountRepo;
	
	@GetMapping
	public List<CreditAccount>get(){
		return accountRepo.findAll();
	}
	
}
