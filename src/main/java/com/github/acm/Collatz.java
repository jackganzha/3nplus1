package com.github.acm;

public class Collatz {

	public int solve(int start, int end) {
		int max = 0;
		for(int i=start; i <= end; i++) {
			int currentCycleLength = cycleLengthFor(i);
			max = Math.max(max, currentCycleLength);
		}
		return max;
	}

	public int cycleLengthFor(int number) {
		
		if(number <= 0) {
			throw new IllegalArgumentException();
		}
		
		int length = 1;
		
		while(number > 1) {
			number = calculateFor(number);
			length++;
		}
		
		return length;
	}

	public int calculateFor(int number) {
		if(number % 2 == 0) {
			return number/2;
		}
		return 3*number + 1;
	}

}
