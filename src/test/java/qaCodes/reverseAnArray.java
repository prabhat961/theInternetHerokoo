package qaCodes;

import java.util.Arrays;

public class reverseAnArray {
	public static void reverse(int[] arr) {
		int lo = 0;
		int hi = arr.length - 1;
		while(lo <= hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 19, 11, 15, 17, 9};
		System.out.println("Array before Sorting:");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("Array after Sorting:");
        System.out.println(Arrays.toString(arr));

	}

}
