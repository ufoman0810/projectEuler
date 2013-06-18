package com.erikbarbara.projecteuler.utilities;

public class PrimeSieve {
	
	private Boolean[] primeSieve;
	
	public static PrimeSieve instance(int value) {
		return new PrimeSieve(value);
	}
	
	private PrimeSieve() {
		
	}
	
	private PrimeSieve(int value) {
		if(value<1) {
			throw new IllegalArgumentException("Value must be a natural number");
		}
		primeSieve = new Boolean[value+1];
		primeSieve[0]=false;
		primeSieve[1]=false;
		for(int i=2;i<=value;i++) {
			if(i%10000==0) {
				System.out.println(i);
			}
			if(primeSieve[i]==null) {
				primeSieve[i]=IntegerUtility.instance().isPrime(i);
				
				for(int j=i+i;j<primeSieve.length-1;j+=i) {
					if(primeSieve[j]==null) {
						primeSieve[j]=false;
					}
				}
			}	
		}
	}

	public boolean isPrime(int value) {
		if(value<1) {
			throw new IllegalArgumentException("Value must be a natural number");
		} else if(value>=primeSieve.length) {
			throw new IllegalArgumentException("Value must be less than the size of the sieve");
		}
		return primeSieve[value];
	}
	
}
