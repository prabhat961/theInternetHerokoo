package qaCodes;

import java.util.HashMap;
import java.util.Map;

public class vowelOPerations {
	public static boolean isVowel(char ch) {
		return "AEIOUaeiou".indexOf(ch) != -1;
	}
	
	public static int countVowelInWord(String str) {
		int count = 0;
		for(int i = 0; i <= str.length() - 1; i++) {
			isVowel(str.charAt(i));
			count++;
		}
		return count;
	}
	
	public static void countEachVowel(String str) {
		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);
		
		for(char ch: str.toCharArray()) {
			if(isVowel(ch)) {
				map.put(ch, map.get(ch) + 1);
			}
		}
		for(Map.Entry<Character, Integer>mp: map.entrySet()) {
			if (mp.getValue()!=0) {
				System.out.print(mp.getKey()+" "+mp.getValue());
			}
		}
	}
	
	public static void maxVowelInWords(String[] str) {
        String maxVowelWord = " ";
        int maxVowelCount = 0;

        for (String word : str) {
            int vowelCount = countVowelInWord(word);
            if (vowelCount > maxVowelCount) {
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
		System.out.println("No. of Vowel in the given word is:"+countVowelInWord("aeroplane"));
		countVowelInWord("aeroplane");
		String[] words = {"hi", "hello", "Good Afternoon", "Good Evening"};
		maxVowelInWords(words);

	}
}
	
	