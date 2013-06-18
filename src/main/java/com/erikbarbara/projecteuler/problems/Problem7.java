package com.erikbarbara.projecteuler.problems;

import com.erikbarbara.projecteuler.utilities.IntegerUtility;

/*
 * What is the 10 001st prime number?
 */
public class Problem7 {
	
	static int nthPrime(int n) {
		if(n<1) {
			throw new IllegalArgumentException("N must be a positive integer.");
		}
		if(n==1) {
			return 2;
		}
		int currentNumber=2;
		for(int counter=1;counter<n;) {
			currentNumber++;
			if(IntegerUtility.instance().isPrime(currentNumber)) {
				counter++;
			}
		}
		return currentNumber;
	}
	
	public static void main(String[] args) {
		System.out.println(Problem7.nthPrime(10001));
	}
}
