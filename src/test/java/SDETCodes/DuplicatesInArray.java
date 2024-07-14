package SDETCodes;

import java.util.HashSet;


public class DuplicatesInArray {
	public static void printDuplicateInTwoLoops(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
	
	public static void printDuplicateInOneLoops(int[] arr) {
		HashSet<Integer>set = new HashSet<Integer>();
		for(int num: arr) {
			if (set.add(num) == false) {
				System.out.print(num + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {15, 21, 36, 21, 15, 98, 21, 15, 774, 15, 36, 21};
		//printDuplicateInTwoLoops(arr);
		System.out.println();
		printDuplicateInOneLoops(arr);

	}

}
