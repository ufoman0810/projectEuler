package com.erikbarbara.projecteuler;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {

	static int smallestNumberDivisibleByRange(int lowerLimit, int upperLimit) {
		if(lowerLimit>upperLimit) {
			throw new IllegalArgumentException("Lower limit of range must be less than or equal to upper limit.");
		}
		if(lowerLimit<1 || upperLimit<1) {
			throw new IllegalArgumentException("Range must be of positive integers.");
		}

		for(int i=upperLimit;i>0;i++) {
			if(isDivisibleByRange(lowerLimit, upperLimit,i)) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean isDivisibleByRange(int lowerLimit,int upperLimit,int value) {
		for(int i=lowerLimit;i<=upperLimit;i++) {
			if(value%i!=0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(Problem5.smallestNumberDivisibleByRange(1, 20));
	}
}
