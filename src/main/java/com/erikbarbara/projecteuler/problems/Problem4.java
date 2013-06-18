package com.erikbarbara.projecteuler.problems;

/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

	static int largestPalindromicNumberOfNDigitMultiples(int n) {
		if(n<1) {
			throw new IllegalArgumentException("N must be greater than or equal to 1.");
		}
		String maxMultiplier = "9";
		String minMultiplier = "1";
		for(int i=1;i<n;i++) {
			maxMultiplier += "9";
			minMultiplier += "0";
		}
		
		int maxPalindromicNumber = 0;
		for(int a=Integer.parseInt(maxMultiplier);a>=Integer.parseInt(minMultiplier);a--) {
			for(int b = Integer.parseInt(maxMultiplier);b>=Integer.parseInt(minMultiplier);b--) {
				if(isPalindromicNumber(a*b) && a*b > maxPalindromicNumber){
					 maxPalindromicNumber = a*b;
				}
			}
		}
		return maxPalindromicNumber;
	}
	
	private static boolean isPalindromicNumber(int value) {
		return Integer.toString(value).equals(new StringBuffer(Integer.toString(value)).reverse().toString());
	}
	
	public static void main(String[] args) {
		System.out.println(Problem4.largestPalindromicNumberOfNDigitMultiples(3));
	}
}
