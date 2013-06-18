package com.erikbarbara.projecteuler.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.erikbarbara.projecteuler.utilities.PythagoreanTriplet;

public class Problem9Test {

	@Test
	public void pythagoreanTripletWithSumOfValueTest() {
		assertEquals(PythagoreanTriplet.instance(3, 4, 5),Problem9.pythagoreanTripletWithSumOfValue(12));
	}
	
	@Test
	public void pythagoreanTripletWithSumOfValueTestThrowsException() {
		try {
			Problem9.pythagoreanTripletWithSumOfValue(0);
			fail("The input should have thrown an exception.");
		} catch(IllegalArgumentException e) {
			assertEquals("Value must be a natural number.",e.getMessage());
		}
	}

}
