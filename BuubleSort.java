package com.pkg.sorting;

import java.util.Arrays;

public class BuubleSort {

	private static void bubbleSort(int[] data) {
		int l = data.length;
		
		for (int i = 0; i < l; i++) {
			boolean swapped = false;
			for (int j = 0; j < l - i - 1; j++) {
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { -2, 45, 0, 11, -9 };
		bubbleSort(data);
		System.out.println(Arrays.toString(data));
	}

}
