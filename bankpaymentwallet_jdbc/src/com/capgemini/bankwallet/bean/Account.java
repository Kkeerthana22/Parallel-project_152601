package com.capgemini.bankwallet.bean;

public class Account {
	private float balance;
	
	private int accountNo;
	
	private Customer cust;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNo=" + accountNo + ", cust=" + cust + "]";
	}
	
	
	
	}
