package com.erikbarbara.projecteuler.utilities;

import java.util.HashSet;
import java.util.Set;

public class IntegerUtility {
	
	private static final IntegerUtility instance = new IntegerUtility();
	private Set<Integer> primeNumbers = new HashSet<Integer>();
	
	public static IntegerUtility instance() {
		return instance;
	}
	
	private IntegerUtility() {
	}

	public boolean isPrime(int value) {
		if(primeNumbers.contains(value)) {
			return true;
		}
		if(value == 1) {
			return false;
		}
		for(int i=2;i<value;i++) {
			if(value%i==0) {
				return false;
			}
		}
		primeNumbers.add(value);
		return true;
	}
	
}
