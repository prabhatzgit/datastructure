package com.pkg.searching;

public class BinarySearchRecursive {

	private static int binarySearchRecursive(int[] array, int x, int low, int high) {

		if (high >= low) {
			int mid = low + (low + high) / 2;

			if (array[mid] == x) {
				return mid;
			}
			if (array[mid] > x) {
				return binarySearchRecursive(array, x, low, mid - 1);
			} else
				return binarySearchRecursive(array, x, mid + 1, high);
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = { 3, 4, 5, 6, 7, 8, 9 };
		int x = 4;
		int n = array.length;
		int result = binarySearchRecursive(array, x, 0, n - 1);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at index " + result);
	}

}

/*
 * Time Complexities
 * 
 * Best case complexity: O(1) 
 * Average case complexity: O(log n) 
 * Worst case
 * complexity: O(log n)
 * Space Complexity
The space complexity of the binary search is O(1)
 */