package com.capgemini.bankwallet.dao;


import com.capgemini.bankwallet.bean.Account;
import com.capgemini.bankwallet.bean.Customer;


public interface IBankWalletDao {
	public boolean addCustomer(Customer cust);
	public float showBalance();
	public boolean depositAmount(float amount);
	public boolean withdrawAmount(float amount);
	public boolean loginAccount(String username,String password);
	public boolean fundTransfer(int accountNo,float amount);
	public void printTransaction();
}