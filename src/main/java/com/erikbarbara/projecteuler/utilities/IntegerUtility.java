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
		if(value == 2 || value == 3 || value == 5) {
			return true;
		}
		String valueString = Integer.toString(value);
		int lastDigit = Integer.valueOf(valueString.substring(valueString.length()-1, valueString.length()));
		if(lastDigit%2==0 || lastDigit%5==0) {
			return false;
		}
		int sumDigits=0;
		for(int i=0;i<valueString.length();i++) {
			sumDigits+=Integer.valueOf(valueString.substring(i, i+1));
		}
		if(sumDigits%3==0) {
			return false;
		}
		for(int i=6;i<value;i++) {
			if(value%i==0) {
				return false;
			}
		}
		primeNumbers.add(value);
		return true;
	}
	
}
