

	package com.capgemini.bankwallet.ui;



	import java.util.Random;
	import java.util.Scanner;

	import com.capgemini.bankwallet.bean.Account;
	import com.capgemini.bankwallet.bean.Customer;
	
	import com.capgemini.bankwallet.service.BankWalletService;
	import com.capgemini.bankwallet.service.BankWalletValidate;


	public class ClientWallet {

				    		public static void main(String[] args) {
			    			
			    			
			    			int choice = 0;
			    			float amount;
			    			BankWalletService service = new BankWalletService();
			    			BankWalletValidate validate = new BankWalletValidate();
			    			Account account = new Account();
			    			
			    			do {
			    				int choice1;
			    				Scanner scan = new Scanner(System.in);
			    				System.out.println("BANK PAYMENT WALLET   ");
			    				System.out.println(" 1.CREATE ACCOUNT");
			    				System.out.println(" 2.LOGIN");
			    				System.out.println("Please enter your Enter Your Choice");
			    				
			    				choice= scan.nextInt();
			    				switch(choice)
			    				{
			    				case 1:
			    					//createAccount();
			    					Customer customer=new Customer();
					    			
					    			Scanner sc = new Scanner(System.in);
					    			
					    			System.out.println("Enter your UserName ");
					    			String username = sc.nextLine();
					    			
					    			System.out.println("Enter your Password");
					    			String password = sc.nextLine();
					    			
					    			
					    			
					    			System.out.println("Enter  Name");
					    			String name = sc.nextLine();
					    			
					    			System.out.println("Enter Age");
					    			int age = scan.nextInt();
					    			
					    			System.out.println("Enter  gender");
					    			String gender = sc.nextLine();
					    			
					    			System.out.println("Enter  EmailID");
					    			String email = sc.nextLine();
					    			
					    			
					    			System.out.println("Enter  12 digit Aadhar Number");
					    			String aadharNumber = sc.nextLine();
					    			
					    			System.out.println("Enter  Mobile Number");
					    			String phoneNumber = sc.nextLine();
					    			
					    			System.out.println("Enter Opening Blanace");
					    			float balance = scan.nextFloat();
					    			
					    			
					    			
					    			
					    			int accountNo = (int)(Math.random() * 123456+123456);
					    		
					    			
					    			
					    			boolean isValidAadharNumber = validate.validateAadharNumber(aadharNumber);
					    			boolean isValidPhoneNumber = validate.validatePhonenumber(phoneNumber);
					    			
					    			if(isValidAadharNumber &&  isValidPhoneNumber  )
					    			{
					    			    customer.setUsername(username);
					    				customer.setPassword(password);
					    				customer.setAadharNumber(aadharNumber);
					    				customer.setName(name);
					    				customer.setAge(age);
					    				customer.setGender(gender);
					    				
					    				customer.setEmail(email);
					    				customer.setPhoneNumber(phoneNumber);
					    				account.setAccountNo(accountNo);
					    				account.setBalance(balance);
					    				account.setCust(customer);
					    				
					    			
					    			
					    			
					    			boolean b = service.addAccount(account);
					    			
				    				if(b)
				    				{
				    					
				    					System.out.println("Account Created.. Account Number is: "+accountNo);
				    					System.out.println("Your UserName is: "+username);
				    					System.out.println("Your Password is :"+password);
				    					
				    				}else
				    				{
				    					System.out.println("Account Not Created");
				    				}    				
				    				
				    			}
				    			
				    			else
				    			{
				    				System.out.println("Wrong Details");
				    			}
				    			
				    			
				    		
					    		
					    		
			    					break;
			    					
			    				case 2:
			    					
			    					Scanner s = new Scanner(System.in);
					    			
					    			System.out.println("Enter Your Username");
					    			username = s.nextLine();
					    			System.out.println("Enter Your Password");
					    			password = s.nextLine();
					    			
					    			boolean b= service.loginAccount(username, password);
					    			
			    					if(b)
			    					{
			    						do {
			    							
			    						    
			    							System.out.println("1. SHOW BALANCE");
			    							System.out.println("2. DEPOSIT AMOUNT");
			    							System.out.println("3. WITHDRAW AMOUNT");
			    							System.out.println("4. FUND TRANSFER");
			    							System.out.println("5. PRINT TRANSACTION");
			    							System.out.println("6. EXIT");
			    							
			    							System.out.println("\nHello User......\nEnter Your Choice");
			    							
			    							choice1 = scan.nextInt(); 
			    							
			    							switch(choice1)
			    							{
			    							
			    							case 1 : 
			    								//showBalance;
			    								 balance = service.showBalance();
			    				    			System.out.println("Account Balance is: "+balance);
			    								break;
			    								
			    							case 2:
			    								//depositAmount;
			    								Scanner scan1 = new Scanner(System.in);
			    				    			
			    				    			System.out.println("Enter amount to deposit");
			    				    			 amount = scan1.nextFloat();
			    				    			boolean isDeposit = service.depositAmount(amount);
			    				    			
			    				    			if(isDeposit)
			    				    			{
			    				    				System.out.println("Amount Deposited in your account");
			    				    			}
			    								break;
			    								
			    							case 3 : 
			    								//withdrawAmount();
			    								Scanner scan2 = new Scanner(System.in);
			    				    			
			    				    			
			    				    			System.out.println("Enter amount to withdraw");
			    				    			
			    				    			amount = scan.nextFloat();
			    				    			boolean isWithDraw = service.withdrawAmount(amount);
			    				    			
			    				    			if(isWithDraw)
			    				    			{
			    				    				System.out.println("Amount Withdraw from your account");
			    				    			}
			    							
			    								break;
			    								
			    							case 4:
			    								//fundTransfer();
			    								Scanner scn = new Scanner(System.in);
			    				    			System.out.println(" Enter Account Number to transfer amount");
			    				    			int accountNo2= scn.nextInt();
			    				    			System.out.println("Enter Amount to Transfer");
			    				    			amount = scn.nextFloat();
			    				    			
			    				    			boolean b1= service.fundTransfer(accountNo2,amount);
			    				    			if(b1)
			    				    			{
			    				    				System.out.println("Fund Successfully Transfer");
			    				    			}
			    				    			else
			    				    			{
			    				    				System.out.println("Enter Correct Input");
			    				    			}
			    				    			break;
			    								
			    							case 5:
			    								
			    				    			service.printTransaction();
			    								break;
			    							case 6: System.exit(0);
			    							break;
			    							
			    								
			    							
			    							
			    							
			    							}
			    						
			    						}while(choice1!=7);
			    						
			    						
			    					}
			    					
			    					else
			    					{
			    						System.out.println("Invalid Login Details..Try Again..");
			    					}
			    				break;
			    				
			    				
			    				}
			    			}while(choice!=3);
			    			
			    			
			    				
			    			
			    			
			    		}
	}
			    		
			    