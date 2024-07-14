package qaCodes;

import java.util.HashMap;
import java.util.Map;

public class maximumRepeatedElement {
	public static void maxRepeatedEle(String str) {
		char c = ' ';
		int maxCount = 0;
		char[] arr = str.toCharArray();
		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		for( char ch: arr) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				int val = map.get(ch);
				map.put(ch, val+1);
			}
		}
		for (Map.Entry<Character, Integer> me:map.entrySet()){
            if (maxCount <  me.getValue()){
                maxCount = me.getValue();
                c = me.getKey();
            }
        }
        System.out.println("Max repeating character in the string is:"+c);
		
		
	}

	public static void main(String[] args) {
		maxRepeatedEle("bbbbfcgrrrrrrkevvvgtt");

	}

}
