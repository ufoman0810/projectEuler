package com.erikbarbara.projecteuler.problems;

import java.util.HashMap;
import java.util.Map;

import com.erikbarbara.projecteuler.utilities.IntegerUtility;


/*
 * What is the value of the first triangle number to have over five hundred divisors?
*/

public class Problem12 {

	static int firstTriangleNumberWithOverNDivisors(int n) {
		if(n<1) {
			throw new IllegalArgumentException("N must be greater than or equal to 1.");
		}
		int currentTriangleNumber=0;
		for(int i=1;i>0;i++) {
			currentTriangleNumber+=i;
			if(numberOfDivisors(currentTriangleNumber)>n) {
				return currentTriangleNumber;
			}
		}
		return -1;
	}
	
	private static int numberOfDivisors(int value) {
		int numberOfDivisors=1;
		Map<Integer,Integer> primeFactorMap = primeFactors(value);
		for(int key : primeFactorMap.keySet()) {
			numberOfDivisors*=(primeFactorMap.get(key)+1);
		}
		return numberOfDivisors;
	}
	
	private static Map<Integer,Integer> primeFactors(int value) {
		Map<Integer,Integer> primeFactors = new HashMap<Integer,Integer>();
		for(int i=2;i<=value;i++) {
			if(value%i==0 && IntegerUtility.instance().isPrime(i)) {
				if(primeFactors.containsKey(i)) {
					primeFactors.put(i, primeFactors.get(i)+1);
				} else {
					primeFactors.put(i, 1);
				}
				Map<Integer,Integer> primeFactorsToAdd = primeFactors(value/i);

				for(int key : primeFactorsToAdd.keySet()) {
					if(primeFactors.containsKey(key)) {
						primeFactors.put(key, primeFactors.get(key)+primeFactorsToAdd.get(key));
					} else {
						primeFactors.put(key, primeFactorsToAdd.get(key));
					}
				}
				return primeFactors;
			}
		}
		return primeFactors;
	}

	public static void main(String[] args) {
		System.out.println(Problem12.firstTriangleNumberWithOverNDivisors(500));
	}
}
