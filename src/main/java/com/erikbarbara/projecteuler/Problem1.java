package com.erikbarbara.projecteuler;

import java.util.ArrayList;
import java.util.List;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
	
	static int sumOfMultiplesOfAandBbelowValue(int a, int b, int value) {
		if(a<=0 || b<=0) {
			throw new IllegalArgumentException("Multiples must be greater than 0.");
		}
		if(a>value || b>value) {
			throw new IllegalArgumentException("Multiples must be less than value or equal to value.");
		}
		int sum=0;
		for(int i:multiplesOfAandBbelowValue(a, b, value)) {
			sum+=i;
		}
		return sum;
	}
	
	private static List<Integer> multiplesOfAandBbelowValue(int a, int b, int value) {
		List<Integer> multiples = new ArrayList<Integer>();
		for(int i=0;i<value;i++) {
			if(i%a==0 || i%b==0) {
				multiples.add(i);
			}
		}
		return multiples;
	}
	
	public static void main(String[] args) {
		System.out.println(Problem1.sumOfMultiplesOfAandBbelowValue(3, 5, 1000));
	}
	
	
}
