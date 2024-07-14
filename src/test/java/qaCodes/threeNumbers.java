package qaCodes;


public class threeNumbers {
	
	public static void printTriplet(int[] arr, int sum) {
		for(int i = 0; i < arr.length;i++) {
			for(int j = i + 1; j < arr.length; j++) {
				for(int k = j +1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == sum ) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		printTriplet(arr, 9);

	}

}
