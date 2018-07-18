package com.capgemini.bankwallet.service;




import com.capgemini.bankwallet.bean.Customer;
import com.capgemini.bankwallet.dao.BankWalletDao;

public class BankWalletService implements IBankWalletService{

	

	
	  BankWalletDao dao = new BankWalletDao();
		
		
		public boolean addCustomer(Customer cust) {
		
			return dao.addCustomer(cust);
		}

		public float showBalance() {
		
			
			return dao.showBalance();
		}

	
		public boolean depositAmount(float amount) {
			
			
			return dao.depositAmount(amount);
		}

		
		public boolean withdrawAmount(float amount) {
			
			return dao.withdrawAmount(amount);
		}

		
		public boolean loginAccount(String uName, String uPassword) {
			
			return dao.loginAccount(uName, uPassword);
		}

		
		public boolean fundTransfer(int accNo, float amount) {
			
			return dao.fundTransfer(accNo,amount);
		}

		
		public void printTransaction() {
			dao.printTransaction();
			
		}
	}