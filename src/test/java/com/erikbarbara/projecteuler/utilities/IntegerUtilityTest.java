package com.erikbarbara.projecteuler.utilities;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerUtilityTest {

	@Test
	public void IsPrimeTest() {
		assertTrue(IntegerUtility.instance().isPrime(3));
		assertTrue(IntegerUtility.instance().isPrime(7));
		assertTrue(IntegerUtility.instance().isPrime(17));
		assertFalse(IntegerUtility.instance().isPrime(4));
	}

}
