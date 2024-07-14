package SDETCodes;

import java.util.Arrays;

public class swapZeros {
	
	public static void moveAllZeros(int[] arr) {
		 int left = 0;

	        // Iterate through the array
	        for (int right = 0; right < arr.length; right++) {
	            // If the current element is non-zero, move it to the `left` position
	            if (arr[right] != 0) {
	                // Swap the non-zero element at `right` with the element at `left`
	                int temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                
	                // Increment the `left` pointer
	                left++;
	            }
	        }
	}

	public static void main(String[] args) {
		int[] arr = {1,3,0,9,0,0,17,0,0,15};
		System.out.println(Arrays.toString(arr));
		moveAllZeros(arr);
		System.out.println(Arrays.toString(arr));
		
		

	}

}
