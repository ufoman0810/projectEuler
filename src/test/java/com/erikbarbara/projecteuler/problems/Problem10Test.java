package com.erikbarbara.projecteuler.problems;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class Problem10Test {

	@Test
	public void sumPrimeNumbersBelowValueTest() {
		assertEquals(BigInteger.valueOf(17),Problem10.sumPrimeNumbersBelowValue(10));
	}
	
	@Test
	public void sumPrimeNumbersBelowValueTestThrowsException() {
		try {
			Problem10.sumPrimeNumbersBelowValue(0);
			fail("Input should have thrown an exception.");
		} catch(IllegalArgumentException e) {
			assertEquals("Value must be greater than or equal to two.",e.getMessage());
		}
	}

}
