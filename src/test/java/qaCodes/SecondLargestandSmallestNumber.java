package qaCodes;

import java.util.Arrays;

public class SecondLargestandSmallestNumber {
	
	//method 1:
	public static void printSecondSmallestAndLargestNumber(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Second Largest Number:"+arr[arr.length - 2]);
		System.out.println("Second Smallest Number:"+arr[1]);
	}
	
	//Method 2:
	public static void printSecondLargestNumberAndSmallest(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for(int num: arr) {
			if (num > max) {
				secondMax = max;
				max = num;
			}
			else if (num > secondMax && num != max) {
				secondMax = num;
				}
			if (num < min) {
				secondMin = min;
				min = num;
			}
			else if (num < secondMin && num != min) {
			secondMin = num;
			}
		}
		System.out.println("Second Largest Number:"+secondMax);
		System.out.println("Second Smallest Number:"+secondMin);
	}

	public static void main(String[] args) {
		int[] arr = { 12, 32, 11, 15, 19, 87, 109};
		printSecondSmallestAndLargestNumber(arr);
		printSecondLargestNumberAndSmallest(arr);
		
	}

}
