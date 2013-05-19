package com.erikbarbara.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem7Test {

	@Test 
	public void nthPrimeTest() {
		assertEquals(13,Problem7.nthPrime(6));
	}
	
	@Test 
	public void nthPrimeTestFirstPrime() {
		assertEquals(2,Problem7.nthPrime(1));
	}
	
	@Test
	public void nthPrimeTestThrowsException() {
		try {
			Problem7.nthPrime(-1);
			fail("The input should have thrown an exception.");		
		} catch(IllegalArgumentException e) {
			assertEquals("N must be a positive integer.",e.getMessage());
		}
	}

}
