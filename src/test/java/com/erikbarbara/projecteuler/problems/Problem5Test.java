package com.erikbarbara.projecteuler.problems;

import static org.junit.Assert.*;

import org.junit.Test;

import com.erikbarbara.projecteuler.problems.Problem5;

public class Problem5Test {

	@Test
	public void smallestNumberDivisibleByRangeTest() {
		assertEquals(2520,Problem5.smallestNumberDivisibleByRange(1, 10));
	}
	
	@Test
	public void smallestNumberDivisibleByRangeTestThrowsException() {
		try{
			Problem5.smallestNumberDivisibleByRange(10, 5);
			fail("The input should have thrown an exception.");		
		} catch (IllegalArgumentException e) {
			assertEquals("Lower limit of range must be less than or equal to upper limit.",e.getMessage());
		}
		try{
			Problem5.smallestNumberDivisibleByRange(-1, 5);
			fail("The input should have thrown an exception.");		
		} catch (IllegalArgumentException e) {
			assertEquals("Range must be of positive integers.",e.getMessage());
		}
	}

}
