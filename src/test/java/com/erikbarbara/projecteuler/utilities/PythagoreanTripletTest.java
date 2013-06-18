package com.erikbarbara.projecteuler.utilities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.erikbarbara.projecteuler.utilities.PythagoreanTriplet;

public class PythagoreanTripletTest {
	
	@Test
	public void notSingleton() {
		PythagoreanTriplet one = PythagoreanTriplet.instance(3, 4, 5);
		PythagoreanTriplet two = PythagoreanTriplet.instance(3, 4, 5);
		assertNotNull(one);
		assertNotNull(two);
		assertNotSame(one, two);
	}

	@Test
	public void instanceTestThrowsException() {
		try {
			PythagoreanTriplet.instance(0, 1, 2);
			fail("The input should have thrown an exception.");
		} catch (IllegalArgumentException e) {
			assertEquals("a, b, and c must be natural numbers where a < b < c.", e.getMessage());
		}
		try {
			PythagoreanTriplet.instance(3, 4, 6);
			fail("The input should have thrown an exception.");
		} catch (IllegalArgumentException e) {
			assertEquals("Input parameters do not form a Pythagorean Triplet.", e.getMessage());
		}
	}
	
	@Test
	public void productTest() {
		assertEquals(60,PythagoreanTriplet.instance(3, 4, 5).product());
	}
	
	@Test
	public void getATest() {
		assertEquals(3,PythagoreanTriplet.instance(3, 4, 5).getA());
	}
	
	@Test
	public void getBTest() {
		assertEquals(4,PythagoreanTriplet.instance(3, 4, 5).getB());
	}
	
	@Test
	public void getCTest() {
		assertEquals(5,PythagoreanTriplet.instance(3, 4, 5).getC());
	}
	
	@Test
	public void equalsTest() {
		assertEquals(PythagoreanTriplet.instance(3, 4, 5),PythagoreanTriplet.instance(3, 4, 5));
	}

}
