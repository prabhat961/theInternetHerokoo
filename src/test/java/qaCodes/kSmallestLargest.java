package qaCodes;

import java.util.Arrays;

public class kSmallestLargest {
	
	public static int kSmallestElement(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}
	
	public static int kLargestElement(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[arr.length - k]; 
	}

	public static void main(String[] args) {
		int[] arr = {11, 28, 13, 15, 12};
		int k = 2;
		System.out.println("kth Largest Element is:"+kLargestElement(arr, k));
		System.out.println("kth smallest element is:"+kSmallestElement(arr, k));

	}

}
