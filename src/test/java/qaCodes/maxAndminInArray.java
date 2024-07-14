package qaCodes;

public class maxAndminInArray {
	public static void printMaxMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
	            max = arr[i];
	        } else if (arr[i] < min) {
	            min = arr[i];
	        }
		}
		System.out.println("Greatest element:"+max);
		System.out.println("Smallest element:"+min);
	}

	public static void main(String[] args) {
		int[] arr = {11, 24, 1, 87, 987, 5, 64};
		printMaxMin(arr);
	}

}
