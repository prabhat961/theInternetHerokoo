package SDETCodes;

public class extractCharacter {
	
	public static void characterExtraction(String str) {
		String alphabet = " ";
		String number = " ";
		String spclChar = " ";
		char[] arr = str.toCharArray();
		for(char ch: arr) {
			if(Character.isDigit(ch)) {
				number = number + ch;
			}
			
			else if(Character.isLetter(ch)) {
				alphabet = alphabet + ch;
			}
			else {
				spclChar = spclChar + ch;
			}
		}
		System.out.print(number + "," + alphabet + ","+ spclChar );
		System.out.println("Number String Length:"+ number.length());
		System.out.println("character String Length:"+ alphabet.length());
		System.out.println("special Character String Length:"+ spclChar.length());
		
	}

	public static void main(String[] args) {
		characterExtraction("Interview@112$$$&vgh");

	}

}
