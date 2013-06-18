package com.erikbarbara.projecteuler.problems;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		String exponentResult = BigInteger.valueOf(2).pow(1000).toString();
		int sum = 0;
		for(int i=0;i<exponentResult.length();i++) {
			sum += Integer.valueOf(Character.toString(exponentResult.charAt(i)));
		}
		System.out.println(sum);
	}

}
