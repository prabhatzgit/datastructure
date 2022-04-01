package com.pkg.searching;

public class BinarySearchIterative {

	private static int binarySearchIterative(int[] array, int x, int low, int high) {
		while (low <= high) {
			int mid = low + (low + high) / 2;
			if (array[mid] == x) {
				return mid;
			}
			if (array[mid] < x) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = { 3, 4, 5, 6, 7, 8, 9 };
		int x = 4;
		int n = array.length;
		int result = binarySearchIterative(array, x, 0, n - 1);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at index " + result);
	}

}
