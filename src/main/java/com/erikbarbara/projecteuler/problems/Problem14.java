package com.erikbarbara.projecteuler.problems;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Problem14 {
	
	private static Map<BigInteger,Integer> sequenceSizeMap = new HashMap<BigInteger,Integer>();
	
	private static BigInteger nextCollatz(BigInteger value) {
		if(value.compareTo(BigInteger.ONE)==0) {
			return BigInteger.ONE;
		} else if(value.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)==0) {
			return value.divide(BigInteger.valueOf(2));
		} else {
			return value.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		int maxSequenceSize=0;
		int maxSequenceStart=0;
		for(BigInteger i=BigInteger.valueOf(2);i.compareTo(BigInteger.valueOf(1000000))<0;i=i.add(BigInteger.ONE)) {
			BigInteger next = i;
			int sequenceLength = 1;
			while(next.compareTo(BigInteger.ONE)!=0) {
				next = nextCollatz(next);
				if(sequenceSizeMap.containsKey(next)) {
					sequenceLength += sequenceSizeMap.get(next);
					break;
				} else {
					sequenceLength++;
				}
			}
			if(sequenceLength>maxSequenceSize) {
				maxSequenceSize=sequenceLength;
				maxSequenceStart=i.intValue();
			}
			sequenceSizeMap.put(i,sequenceLength);
		}
		System.out.println(maxSequenceStart);
	}

}
