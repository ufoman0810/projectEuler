package com.erikbarbara.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem2Test {

	@Test
	public void sumFibonnaciTermsBelowValueTest() {
		assertEquals(10,Problem2.sumFibonnaciTermsBelowValue(10));
	}
	
	@Test
	public void sumFibonnaciTermsBelowValueTestThrowsException() {
		try {
			Problem2.sumFibonnaciTermsBelowValue(-1);
			fail("The input should have thrown an exception.");
		} catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(),"Value must be greater than or equal to 1.");
		}
	}

}
