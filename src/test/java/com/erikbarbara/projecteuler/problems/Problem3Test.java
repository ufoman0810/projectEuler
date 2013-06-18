package com.erikbarbara.projecteuler.problems;

import static org.junit.Assert.*;

import org.junit.Test;

import com.erikbarbara.projecteuler.problems.Problem3;

public class Problem3Test {

	@Test
	public void largestPrimeNumberBelowValueTest() {
		assertEquals(29,Problem3.largestPrimeFactorBelowValue(13195));
	}
	
	@Test
	public void largestPrimeFactorBelowValueTestThrowsException() {
		try {
			Problem3.largestPrimeFactorBelowValue(2);
			fail("The input should have thrown an exception.");
		} catch(IllegalArgumentException e) {
			assertEquals("Value must be greater than or equal to 4.",e.getMessage());
		}
	}

}
