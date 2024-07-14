package qaCodes;

import java.util.Arrays;

public class sorting {
	public static void sort(int[] arr) {
		for ( int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 19, 31, 24, 98, 109, 167};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
