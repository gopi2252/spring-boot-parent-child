package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_account")
public class CreditAccount {
	
	@Column(name = "credit_limit")
	private Long creditLimit;
	
	@Id
	@Column(name = "account_id")
	private Long accountId;


	public Long getCreditLimit() {
		return creditLimit;
	}


	public void setCreditLimit(Long creditLimit) {
		this.creditLimit = creditLimit;
	}


	public Long getAccountId() {
		return accountId;
	}


	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}


	@Override
	public String toString() {
		return "CreditAccount [creditLimit=" + creditLimit + ", accountId=" + accountId + "]";
	}
	
	
}
