package com.erikbarbara.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem4Test {

	@Test
	public void largestPalindromicNumberOfNDigitMultiplesTest() {
		assertEquals(9009, Problem4.largestPalindromicNumberOfNDigitMultiples(2));
	}
	
	@Test
	public void largestPalindromicNumberOfNDigitMultiplesTestThrowsException() {
		try {
			Problem4.largestPalindromicNumberOfNDigitMultiples(0);
			fail("The input should have thrown an exception.");
		} catch(IllegalArgumentException e) {
			assertEquals("N must be greater than or equal to 1.",e.getMessage());
		}
	}

}
