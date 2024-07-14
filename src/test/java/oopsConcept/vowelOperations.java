package oopsConcept;

import java.util.HashMap;
import java.util.Map;

public class vowelOperations {
	
	public static boolean isVowel(char ch) {
		return "AEIOUaeiou".indexOf(ch) != -1;
	}
	
	public static int countVowelInWord(String s) {
		int count = 0;
		for(int i = 0; i <= s.length() - 1; i++) {
			isVowel(s.charAt(i));
			count++;
		}
		return count;
	}
	
	public static void countSpecificVowel(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 1);
		map.put('e', 1);
		map.put('i', 1);
		map.put('o', 1);
		map.put('u', 1);
		
		for(int i = 0; i < s.length() - 1; i++) {
			if(map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		}
		
		for(Map.Entry<Character, Integer>mp: map.entrySet()) {
			if (mp.getValue()!=0) {
				System.out.print(mp.getKey()+" "+mp.getValue());
			}
	}
}
	
	public static void maxVowelInWord(String[] str) {
		String maxVowelWord = " ";
        int maxVowelCount = 0;
        
        for(String word: str) {
        	int vowelCount = countVowelInWord(word);
        	if(vowelCount > maxVowelCount) {
        		maxVowelCount = vowelCount;
        		maxVowelWord = word;
        	}
        }
        
        if (maxVowelWord != null) {
            System.out.println("Word with maximum vowels: " + maxVowelWord);
        } else {
            System.out.println("No word with vowels found.");
        }
	}
	

	public static void main(String[] args) {
		System.out.println("Number of vowel present"+countVowelInWord("animal"));
		countSpecificVowel("aeroplane");
		String[] words = {"hi", "hello", "Good Afternoon", "Good Evening"};
		maxVowelInWord(words);

	}

}
