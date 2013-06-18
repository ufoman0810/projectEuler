package com.erikbarbara.projecteuler.problems;

import java.math.BigInteger;

/*
 * Find the sum of all the primes below two million.
 */
public class Problem10 {

	static BigInteger sumPrimeNumbersBelowValue(int value) {
		if(value<2) {
			throw new IllegalArgumentException("Value must be greater than or equal to two.");
		}
		BigInteger sum = BigInteger.ZERO;
		for(BigInteger i = BigInteger.valueOf(2);i.compareTo(BigInteger.valueOf(value))<0;i=i.nextProbablePrime()) {
			sum = sum.add(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(Problem10.sumPrimeNumbersBelowValue(2000000));
	}
}
