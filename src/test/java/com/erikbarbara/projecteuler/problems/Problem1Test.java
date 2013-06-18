package com.erikbarbara.projecteuler.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.erikbarbara.projecteuler.problems.Problem1;

public class Problem1Test {

	@Test
	public void sumOfMultiplesOfAandBbelowValueTest() {
		assertEquals(23,Problem1.sumOfMultiplesOfAandBbelowValue(3, 5, 10));
	}
	
	@Test
	public void sumOfMultiplesOfAandBbelowValueTestThrowsException() {
		try {
			Problem1.sumOfMultiplesOfAandBbelowValue(-1, 3, 10);
			fail("The input should have thrown an exception");
		} catch (IllegalArgumentException e) {
			assertEquals("Multiples must be greater than 0.",e.getMessage());
		}
		try {
			Problem1.sumOfMultiplesOfAandBbelowValue(3, -1, 10);
			fail("The input should have thrown an exception");
		} catch (IllegalArgumentException e) {
			assertEquals("Multiples must be greater than 0.",e.getMessage());
		}
		try {
			Problem1.sumOfMultiplesOfAandBbelowValue(2, 20, 10);
			fail("The input should have thrown an exception");
		} catch (IllegalArgumentException e) {
			assertEquals("Multiples must be less than value or equal to value.",e.getMessage());
		}
	}

}
