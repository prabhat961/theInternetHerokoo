package SDETCodes;

import java.util.HashSet;

public class printDUplicatesINString {
	
	public static void printDuplicate(String str) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0; i < str.length();i++) {
			if(set.contains(str.charAt(i))) {
				System.out.print(str.charAt(i) + " ");
			}
			set.add(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		printDuplicate("geeksforgeeks");

	}

}
