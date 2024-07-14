package SDETCodes;

public class reverseWords {
	
	public static String wordReverse(String str) {
		String[] arr = str.split(" ");
		String reverseSentence = " ";
		for(String word: arr) {
			String reverseWord = " ";
			for(int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			reverseSentence = reverseSentence + reverseWord + " ";
		}
		return reverseSentence;
	}

	public static void main(String[] args) {
		String str = "i love you prabhat";
		System.out.println("Original Sentence:"+str);
		System.out.println("Reversed Sentence:"+wordReverse(str));
		;
		
	}

}
