package qaCodes;

public class checkElement {
	//Method 1:
	public static void isPresent(int[] arr, int ele) {
		for(int c: arr) {
			if (c== ele) {
				System.out.println("Element Present");
				}
		}
		System.out.println("Element not Present");
	}
	
	//Method 2:
	public static boolean chkele(int[] arr, int ele) {
		for(int c: arr) {
			if (c== ele) {
				return true;
				}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {11, 24, 1, 87, 987, 5, 64};
		isPresent(arr, 5);
		System.out.println("the element is Present:"+chkele(arr, 87));
	}

}
