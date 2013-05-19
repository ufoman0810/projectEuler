package com.erikbarbara.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem6Test {

	@Test
	public void differenceSumSquareAndSquareSumTest() {
		assertEquals(2640,Problem6.differenceSumSquareAndSquareSum(10));
	}
	
	@Test
	public void differenceSumSquareAndSquareSumTestThrowsException() {
		try {
			Problem6.differenceSumSquareAndSquareSum(0);
			fail("The input should have thrown an exception.");
		}  catch(IllegalArgumentException e) {
			assertEquals("Max must be greater than or equal to 1.",e.getMessage());
		}
	}

}
