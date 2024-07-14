package qaCodes;

import java.util.HashSet;


public class duplicateInString {
	//Duplicate word in Sentence
	public static void findDuplicate(String str) {
		String[] arr = str.split(" ");
		HashSet<String>set = new HashSet();
		for(String w: arr) {
			if (set.contains(w)) {
				System.out.print(w+",");
			}
			set.add(w);
		}
	}

	public static void main(String[] args) {
		findDuplicate("ramesh is the topper is the");

	}

}
