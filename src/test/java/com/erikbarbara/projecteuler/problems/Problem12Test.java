package com.erikbarbara.projecteuler.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.erikbarbara.projecteuler.problems.Problem12;

public class Problem12Test {

	@Test
	public void firstTriangleNumberWithOverNDivisorsTest() {
		assertEquals(28,Problem12.firstTriangleNumberWithOverNDivisors(5));
	}
	
	
	@Test
	public void firstTriangleNumberWithOverNDivisorsTestThrowsException() {
		try {
			Problem12.firstTriangleNumberWithOverNDivisors(0);
			fail("The input should have thrown an exception.");
		} catch (IllegalArgumentException e) {
			assertEquals("N must be greater than or equal to 1.",e.getMessage());
		}
	}

}
