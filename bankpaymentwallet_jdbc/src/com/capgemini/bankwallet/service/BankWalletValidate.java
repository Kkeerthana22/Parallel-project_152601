
	package com.capgemini.bankwallet.service;

	public class BankWalletValidate {
		
		
		
			
			public boolean validateAadharNumber(String aadharNumber)
			{
				if(aadharNumber.length()==12)
				{
					return true;
				}
				else {
					return false;
				}
			}
			
			
			public boolean validatePhonenumber(String phoneNumber) {
					String pattern1="[7-9]?[0-9]{10}";
					if(phoneNumber.matches(pattern1))
					{
						return true;
					}else {
						return false;
					}
				}
				
				/*if(phoneNumber.length()==10)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			*/
			
			/*public boolean validateInitBal(float initBal)
			{
				if( initBal>=1000)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			*/
			
			public boolean validateUsername(String username)
			{
				return true;
				
			}
			
			public boolean validatePassword(String password)
			{
				return true;
				
			}

		}

				
				
			


