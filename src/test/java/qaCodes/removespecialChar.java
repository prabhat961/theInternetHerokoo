package qaCodes;

import java.util.regex.Pattern;

public class removespecialChar {
	public static String removeSpecialCharactersAndDigits(String input) {
        Pattern pattern = Pattern.compile("[^a-zA-Z ]");
        return pattern.matcher(input).replaceAll("");
    }
	
	public static String removeChar(String str) {
		String res = " ";
		for(int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				res = res + str.charAt(i);
			}
		}
		return res;	
	}

	public static void main(String[] args) {
		System.out.println(removeChar("Test@123"));

	}

}
