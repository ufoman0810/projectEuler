package com.erikbarbara.projecteuler.problems;

/*
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {

	static int differenceSumSquareAndSquareSum(int max) {
		if(max<1) {
			throw new IllegalArgumentException("Max must be greater than or equal to 1.");
		}
		return squareSum(max)-sumSquares(max);
	}
	
	private static int sumSquares(int max) {
		int sum=0;
		for(int i=1;i<=max;i++) {
			sum+=i*i;
		}
		return sum;
	}
	
	private static int squareSum(int max) {
		int sum=0;
		for(int i=1;i<=max;i++) {
			sum+=i;
		}
		return sum*sum;
	}
	
	public static void main(String[] args) {
		System.out.println(Problem6.differenceSumSquareAndSquareSum(100));
	}
}
