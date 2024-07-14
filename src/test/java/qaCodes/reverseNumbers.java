package qaCodes;

public class reverseNumbers {
	
	public static String reverseNumbers(String str) {
		char[] chars = str.toCharArray();
		int left = 0;
		int right = chars.length - 1;
		
		while( left < right) {
			while (left < right && !Character.isDigit(chars[left])) {
				left++;
			}
			
			while(left < right && !Character.isDigit(chars[right])) {
				right--;
			}
			
			if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
			}
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		String str = "a93wc5t67u";
		String revStr =  reverseNumbers(str);
		System.out.println("Given String:"+str);
		System.out.println("Reversed String:"+revStr);

	}

}
