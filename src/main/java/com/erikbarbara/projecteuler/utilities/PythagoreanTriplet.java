package com.erikbarbara.projecteuler.utilities;

public class PythagoreanTriplet {
	
	private final int a;
	private final int b;
	private final int c;

	public static PythagoreanTriplet instance(int a, int b, int c) {
		if(!(a < b && b < c && a>0)) {
			throw new IllegalArgumentException("a, b, and c must be natural numbers where a < b < c.");
		}
		if(Math.pow(a,2)+Math.pow(b, 2) != Math.pow(c, 2)) {
			throw new IllegalArgumentException("Input parameters do not form a Pythagorean Triplet.");
		}
		return new PythagoreanTriplet(a, b, c);
	}
	
	private PythagoreanTriplet() {
		this.a=0;
		this.b=0;
		this.c=0;
	}

	private PythagoreanTriplet(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public int product() {
		return this.getA()*this.getB()*this.getC();
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public int getC() {
		return this.c;
	}
	
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
	    if (other == this) {
	    	return true;
	    }
	    if (!(other instanceof PythagoreanTriplet)) {
	    	return false;
	    }
	    PythagoreanTriplet otherMyClass = (PythagoreanTriplet) other;
	    return otherMyClass.getA()==this.getA() && otherMyClass.getB()==this.getB() && otherMyClass.getC()==this.getC();
	}
}
