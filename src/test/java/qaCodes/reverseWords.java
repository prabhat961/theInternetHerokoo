package qaCodes;

public class reverseWords {
	public static String wordReverse(String str) {
		String[] words = str.split(" ");
		String reverseString = " ";
		for(String w: words) {
			String reverseWord = " ";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		return reverseString;
	}
	

	public static void main(String[] args) {
		System.out.println(wordReverse("my name is prabhat"));

	}

}
