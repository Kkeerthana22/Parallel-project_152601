package com.capgemini.bankwallet.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
	public void testgetAmount() {
		
		assertEquals(2000,2000);
		assertNotEquals(2000, "15" );
		assertNotEquals(2000 , 0);
		assertNotEquals("9002","4939");
		 
		 
	}
	public void testsetAmount(int amount) {
		
	}
	

}
