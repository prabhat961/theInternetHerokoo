package qaCodes;

public class swapAllternate {
	
	public static String allternateSwapping(String str) {
		char[] arr = str.toCharArray();
		int lo = 0;
		int hi = arr.length - 1;
		while(lo <= hi) {
			char temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo += 2;
			hi -= 2;
		}
		return new String(arr);
	}
	

	public static void main(String[] args) {
		System.out.println(allternateSwapping("abcdef"));

	}

}
