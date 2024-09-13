package com.testingshastra;

import java.util.Iterator;

public class DutchNationalFlagProblem {

	
	public static int[] dutchNationalFlagProblem(int[] a) {
		int lo = 0;
        int hi = a.length - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                    // If the element is 1
                case 1:
                    mid++;
                    break;
                    // If the element is 2
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
		return a;
	}
	public static void sortZerosOnesAndTwosBrutForce() {
		int[] arr = { 0, 1, 2, 0, 1, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {

			System.out.print(i+",");
		}
	}
	
	public static void main(String[] args) {
		//sortZerosOnesAndTwosBrutForce();
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int[] x = dutchNationalFlagProblem(arr);
        for (int i : x) {
			System.out.print(i+",");
		}
	}
}
