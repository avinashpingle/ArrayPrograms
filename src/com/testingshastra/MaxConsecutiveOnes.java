package com.testingshastra;

import java.util.Iterator;

public class MaxConsecutiveOnes {
	
	public static void countMaxConsecutiveOnesCopy() {
		int[] arr = { 1, 1, 0, 1, 1, 1 };

		int count = 0;
		int maxCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1) {
				count++;
				if(count>maxCount) {
					maxCount = count;
				}
			}else {
				count = 0;
			}
		}
		
		System.out.println("Max Count: "+count);
	}

	public static void main(String[] args) {
		countMaxConsecutiveOnesCopy();
	}
}
