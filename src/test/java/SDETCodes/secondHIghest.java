package SDETCodes;

import java.util.Arrays;

public class secondHIghest {
	//Method 1:
	public static void findSecondHighest(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Second Highest Element is:"+arr[arr.length - 2]);
	}
	
	//Method 2:
	public static void findSecondHighestElement(int[] arr) {
		
		if (arr.length < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }
		int highest = Integer.MIN_VALUE;
		int second_Highest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			highest = Math.max(highest, arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != highest) 
				second_Highest = Math.max(second_Highest, arr[i]);
				}
		System.out.println("Second Highest Element is:"+second_Highest);
	}
	
	//Method 3:
	public static void findSecondHighestNumber(int[] arr) {
		if (arr.length < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }
		int highest = Integer.MIN_VALUE;
		int second_Highest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				second_Highest = highest;
                highest = arr[i];
            }
			else if (arr[i] > second_Highest && arr[i] != highest)
				second_Highest = arr[i];
		}
		System.out.println("Second Highest Element is:"+second_Highest);
		
	}
	

	public static void main(String[] args) {
		int[] arr = {1,3,0,9,0,0,17,0,0,15};
		findSecondHighest(arr);
		findSecondHighestElement(arr);
		findSecondHighestNumber(arr);
	}

}
