

	package com.capgemini.bankwallet.service;




	import com.capgemini.bankwallet.bean.Account;

	import com.capgemini.bankwallet.dao.BankWalletDao;

	public class BankWalletService implements IBankWalletService{

		

		
		  BankWalletDao dao = new BankWalletDao();
			
			
			public boolean addAccount(Account account) {
			
				return dao.addAccount(account);
			}

			public float showBalance() {
			
				
				return  dao.showBalance();
			}

		
			public boolean depositAmount(float amount) {
				
				
				return dao.depositAmount(amount);
			}

			
			public boolean withdrawAmount(float amount) {
				
				return dao.withdrawAmount(amount);
			}

			
			public boolean loginAccount(String username, String password) {
				
				return dao.loginAccount(username, password);
			}

			
			public boolean fundTransfer(int accountNo2, float amount) {
				
				return dao.fundTransfer(accountNo2,amount);
			}

			
			public void printTransaction() {
				dao.printTransaction();
				
			}
		}