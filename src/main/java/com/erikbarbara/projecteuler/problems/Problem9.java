package com.erikbarbara.projecteuler.problems;

import com.erikbarbara.projecteuler.utilities.PythagoreanTriplet;

/*
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 {
	
	static PythagoreanTriplet pythagoreanTripletWithSumOfValue(int value) {
		if(value<1) {
			throw new IllegalArgumentException("Value must be a natural number.");
		}
		for(int a=1;a<value;a++) {
			for(int b=a+1;b<value;b++) {
				for(int c=b+1;c<value;c++) {
					if((a+b+c)== value) {
						if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2)) {
							return PythagoreanTriplet.instance(a, b, c);
						}
					}
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(Problem9.pythagoreanTripletWithSumOfValue(1000).product());
	}

}