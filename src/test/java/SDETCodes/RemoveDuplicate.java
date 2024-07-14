package SDETCodes;

import java.util.HashSet;

public class RemoveDuplicate {
	
	public static void printUnique(String str) {
		String unique = " ";
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0; i < str.length();i++) {
			set.add(str.charAt(i));
		}
		for(char ch: set) {
			unique = unique + ch;
		}
		System.out.println(unique);
	}

	public static void main(String[] args) {
		printUnique("geeksforgeeks");

	}

}
