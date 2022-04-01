package com.pkg.searching;

public class LinearSearch {

	private static int linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 0, 1, 9 };
		int x = 1;
		int result = linearSearch(arr, x);
		if (result == -1) {
			System.out.print("Element not found");
		} else
			System.out.print("Element found : " + result);
	}

}
