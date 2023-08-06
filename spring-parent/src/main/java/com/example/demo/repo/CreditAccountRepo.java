package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CreditAccount;

public interface CreditAccountRepo extends JpaRepository<CreditAccount, Long>{

}
