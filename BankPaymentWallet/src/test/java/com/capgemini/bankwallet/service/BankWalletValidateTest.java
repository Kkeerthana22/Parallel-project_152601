package com.capgemini.bankwallet.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankWalletValidateTest {

	@Test
	public void testValidateAge() {
	
		  assertEquals(18,18);
		 assertEquals(0,0);
		 assertNotEquals(18,"ab");
		 
	
	}

	@Test
	public void testValidatePhoneNumber() {
		assertEquals("9553977751", "9553977751");
		assertNotEquals("9553977751", "123456789");
		assertNotSame("9553977751", " ");
		assertEquals("900214939","abc");
	}

	@Test
	public void testValidateAadharNumber() {
		assertEquals("214256789012", "214256789012");
		assertNotSame("214256789012", "123456789012");
		assertNotEquals("214256789012", " ");
		assertNotEquals("214256789012", "abcdefgh");
	
	}

	@Test
	public void testValidateEmail() {
		assertSame("keerthana@gmail.com","keerthana@gmail.com");
		assertNotSame("keerthana@gmail.com"," ");
		assertNotEquals("keerthana@gmail.com","prasanna@gmail.com");
		assertNotEquals("keerthana@gmail.com","123456@gmail.com");
	}

}
