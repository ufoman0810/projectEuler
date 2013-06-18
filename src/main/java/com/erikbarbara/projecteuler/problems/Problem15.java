package com.erikbarbara.projecteuler.problems;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Problem15 {
	
	private static Map<String,BigInteger> gridMoveCountMap = new HashMap<String,BigInteger>();
	
	private static BigInteger move(int height,int width) {
		if(gridMoveCountMap.containsKey(height+"-"+width)) {
			return gridMoveCountMap.get(height+"-"+width);
		}
		if(height==0 && width==0) {
			return BigInteger.ONE;
		}
		BigInteger numberOfMoves=BigInteger.ZERO;
		if(height>0) {
			numberOfMoves = numberOfMoves.add(move(height-1,width));
		}
		if(width>0) {
			numberOfMoves = numberOfMoves.add(move(height,width-1));
		}
		if(!gridMoveCountMap.containsKey(height+"-"+width)) {
			gridMoveCountMap.put(height+"-"+width, numberOfMoves);
			gridMoveCountMap.put(width+"-"+height, numberOfMoves);
		}
		return numberOfMoves;
	}

	public static void main(String[] args) {
		System.out.print(Problem15.move(20,20));
	}

}
