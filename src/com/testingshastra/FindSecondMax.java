package com.testingshastra;

import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondMax {
	
	public static void usingCollection(int[] arr) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			ts.add(arr[i]);
		}
		System.out.println("Second max: "+ts.lower(ts.last()));
	}
	
	
	public static void brutForce(int[] arr) {
		
		int max = arr[0], secondMax=0;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max || arr[i]>secondMax) {
				secondMax = max;
				max = arr[i];
			}
		}
		
		System.out.println("Second Max: "+secondMax);
	}
	
	public static void main(String[] args) {
		int[] x = {12,48,96,49,51,73,23,11,96};	
		//brutForce(x);
		usingCollection(x);
	}
}
