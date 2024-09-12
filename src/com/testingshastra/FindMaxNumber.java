package com.testingshastra;

public class FindMaxNumber {

	public static int findMaxFrom(int[] x) {
		int max = x[0];
		
		for (int i = 1; i < x.length; i++) {
			if(x[i]>max) {
				max = x[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {18,21,34,91,47,56};
		System.out.println(findMaxFrom(arr));
	}
}
