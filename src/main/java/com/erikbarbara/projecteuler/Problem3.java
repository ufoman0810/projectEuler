package com.erikbarbara.projecteuler;

import java.util.ArrayList;
import java.util.List;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

	static long largestPrimeFactorBelowValue(long value) {
		if(value<4) {
			throw new IllegalArgumentException("Value must be greater than or equal to 4.");
		}
		for(long i=value/2+1;i>1;i--) {
			if(value%i==0 && isPrime(i)) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean isPrime(long value) {
		if(value<1) {
			return false;
		}
		for(int i=2;i<value;i++) {
			if(value%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(Problem3.largestPrimeFactorBelowValue(600851475143L));
	}

}
