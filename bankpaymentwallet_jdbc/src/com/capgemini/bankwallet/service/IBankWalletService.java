
	package com.capgemini.bankwallet.service;

	import com.capgemini.bankwallet.bean.Account;
import com.capgemini.bankwallet.bean.Customer;



	public interface IBankWalletService {
	
		public boolean addAccount(Account account);
		public float showBalance();
		public boolean depositAmount(float amount);
		public boolean withdrawAmount(float amount);
		public boolean loginAccount(String username,String password);
		public boolean fundTransfer(int accountNo2, float amount);
		public void printTransaction();
	
		}

