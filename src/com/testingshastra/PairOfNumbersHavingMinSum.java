package com.testingshastra;

public class PairOfNumbersHavingMinSum {

		public static int[] brutForce(int[] arr) {
			
			int min = arr[0], secondMin=0;
			int[] pair = new int[2];
			for (int i = 1; i < arr.length; i++) {
				if(arr[i]<min || arr[i]<secondMin) {
					secondMin = min;
					min = arr[i];
				}
			}
			pair[0] = min;
			pair[1] = secondMin;
			return pair;
		}
		
		public static void main(String[] args) {
			int[] x = {12,48,96,49,51,73,23,11,96};	
			int[] pair = brutForce(x);
			System.out.println("The numbers with min sum are: "+pair[0]+","+pair[1]);
		}
	}
