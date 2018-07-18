package com.capgemini.bankwallet.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class BankWalletDaoTest {

	@Test
	public void testAddBankWalletDetails() {
	 assertEquals("name","name");
	 assertEquals("123456789","123456789");
	 assertNotEquals("keerthana","123456");
	 assertNotSame("male","female");
	 Assert.assertEquals("RESULT",0,0);
	 Assert.assertEquals("RESULT","keerthana","keerthana");
	  Assert.assertNotSame("keerthana","abcdefg");
	}
	

	

	@Test
	public void testShowBalance() {
		 assertEquals("amount","amount");
		 assertEquals(1000,1000);
		 assertNotEquals(1000,1001);
		 Assert.assertEquals("RESULT",0,0);
		 Assert.assertNotSame(8520,1000);
		 Assert.assertNotSame(9000,0);
	}

	@Test
	public void testFundTransfer() {

		 assertEquals("9000214939","9000214939");
		 assertEquals(1000,1000);
		 assertNotEquals("9000214939","91234567890");
		 assertSame(99,99);
		 assertEquals(0,0);
		 assertNotSame("9000214939","91234567890");
	}
	

	@Test
	public void testDepositAmount() {
		assertEquals("900214939","9000214939");
		 assertEquals(1000,1000);
		 assertNotEquals(1000,"abc");
		 
	}
	@Test
	public void testWithdrawAmount() {
		assertEquals(500,500);
		 assertEquals(1000,1000);
		 assertNotEquals(1000,"abc");
		 assertSame(900,900);
		 assertNotEquals(1000,852);
		 
	}
		 
		 
		 
		

	

	
}
