package com.testingshastra;

public class FindSecondMax {

	public static void main(String[] args) {
		int[] x = {12,48,96,49,51,73,23,11,96};
		int max = x[0], secondMax=0;
		
		for (int i = 0; i < x.length; i++) {
			if(x[i]>max) {
				secondMax = max;
				max = x[i];
			}else if(x[i]>secondMax) {
				secondMax = x[i];
			}
		}
		
		System.out.println("Second Max: "+secondMax);
		System.out.println("Max: " + max);		
		
	}
}
