package com.capgemini.bankwallet.dao;




import java.util.HashMap;

import com.capgemini.bankwallet.bean.Account;
import com.capgemini.bankwallet.bean.Customer;





public class BankWalletDao implements IBankWalletDao {
		static HashMap<String,Customer> map = new HashMap<String,Customer>();

		static HashMap<String, Account> map1 = new HashMap<String,Account>();
		Customer cust =new Customer();
		static Customer acc;
		Account acc1 = new Account() ;
		
		
		public boolean addCustomer(Customer cust){
		
			map.put(cust.getUsername(), cust);
			System.out.println(map);
			
			return true;
		}

		public float showBalance() {
		
			return acc1.getBalance();
		}

		
		public boolean depositAmount(float amount) {
			
			
					acc1.setBalance(acc1.getBalance()+amount);
			
			return true;
		}

	
		public boolean withdrawAmount(float amount) {
			
			
				
					if(acc1.getBalance() >= (amount+500))
					{
						acc1.setBalance(acc1.getBalance()-amount);
						return true;
					}
					else
					{
						System.out.println("Minimum Balance Violation");
					}
					return false;
			
			
		}

		public boolean loginAccount(String username, String password) {
			
			for(String key : map.keySet())
			{
				acc = map.get(key);
				if( acc.getUsername().equals(username) && acc.getPassword().equals(password))
				{
					return true;
				}
			}
			return false;
			
		}


		public boolean fundTransfer(int accountNo, float amount) {
		
			for(String key : map.keySet())
			{
				
				Account ac =  map1.get(key);
			
				if(ac.getAccountNo()==accountNo)
				{
					ac.setBalance(ac.getBalance()+amount);
					acc1.setBalance(acc1.getBalance()-amount);
					return true;
				}
			}
			return false;
		}
		

		public void printTransaction() {
			// TODO Auto-generated method stub
			System.out.println(acc1);
			
		}

		

	}