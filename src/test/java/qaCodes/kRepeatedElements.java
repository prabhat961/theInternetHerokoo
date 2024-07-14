package qaCodes;

import java.util.HashMap;
import java.util.Map;


public class kRepeatedElements {
	
	public static void kRepeated(String str, int k) {
		char[] arr = str.toCharArray();
		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		for(char c: arr) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		for(Map.Entry<Character, Integer>me:map.entrySet()) {
			if (me.getValue() == k) {
				System.out.println("The element is:"+me.getKey());
			}
		}
		
	}

	public static void main(String[] args) {
	kRepeated("bbbbfcgrrrrrrkevvvgtt", 6);
	}

}
