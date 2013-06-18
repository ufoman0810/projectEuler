package com.erikbarbara.projecteuler.utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PrimeSieveTest {

	@SuppressWarnings("deprecation")
	@Test
	public void getPrimeSieveTest() {
		PrimeSieve sieve = PrimeSieve.instance(5);
		assertEquals(false,sieve.isPrime(1));
		assertEquals(true,sieve.isPrime(2));
		assertEquals(true,sieve.isPrime(3));
		assertEquals(false,sieve.isPrime(4));
		assertEquals(true,sieve.isPrime(5));
	}
	
	@Test
	public void getPrimeSieveTestThrowsException() {
		try {
			PrimeSieve.instance(-1);
			fail("The input should have thrown an exception.");
		} catch(IllegalArgumentException e) {
			assertEquals("Value must be a natural number",e.getMessage());
		}
	}

}
