package com.capgemini.bankwallet.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {

	
		@Test
		public void testGetName() {
			assertEquals("keerthana","keerthana");
			
			assertNotEquals("keerthana", 123456);
		    assertNotEquals("keerthana",  " ");
		    
			
		}

		@Test
		public void testSetName() {
			fail("Not yet implemented");
		}

		@Test
		public void testGetAge() {
			fail("Not yet implemented");
			assertEquals(21,21);
			assertNotEquals(21, 15 );
			assertNotEquals(21 , 0);
			
		}

		@Test
		public void testSetAge() {
			fail("Not yet implemented");
		}

		@Test
		public void testGetAadharNumber() {
			assertEquals("214256789012", "214256789012");
			assertNotSame("214256789012", "123456789012");
			assertNotEquals("214256789012", " ");
		}

		@Test
		public void testSetAadharNumber() {
			fail("Not yet implemented");
		}

		@Test
		public void testGetPhoneNumber() {
			assertEquals("9553977751", "9553977751");
			assertNotEquals("9553977751", "123456789");
			assertNotEquals("9553977751", " ");
			assertEquals("900214939","abc");
			 
		}

		@Test
		public void testSetPhoneNumber() {
			fail("Not yet implemented");
		}

		@Test
		public void testGetEmail() {
			assertSame("keerthana@gmail.com","keerthana@gmail.com");
			assertNotSame("keerthana@gmail.com"," ");
			assertNotEquals("keerthana@gmail.com","prasanna@gmail.com");
			assertNotEquals("keerthana@gmail.com","123456@gmail.com");	
			
		}

		@Test
		public void testSetEmail() {
			fail("Not yet implemented");
		}

		@Test
		public void testGetGender() {
			assertEquals("female","female");
			assertEquals("male","male");
			assertNotEquals("female","f");
			assertNotEquals("male", "m"); 
			assertNotEquals("female",  "keerthana ");
			
		}

		@Test
		public void testSetGender() {
			fail("Not yet implemented");
		}
}
