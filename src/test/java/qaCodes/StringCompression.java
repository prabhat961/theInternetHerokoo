package qaCodes;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
	//Method 1: without order
	public static void stringCompressionwithoutOrder(String str) {
		for(char c = 'a'; c <= 'z'; c++) {
			int count = 0;
			for( int i = 0; i <= str.length() -1; i++) {
				if (str.charAt(i) == c) {
					count++;
				}
			}
				if (count != 0) 
					System.out.print(c+""+count);
		}
	}
	
	//Method 2: with order maintained
	
	public static void stringCompressionwithOrder(String str) {
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
				System.out.print(me.getKey()+""+me.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		stringCompressionwithOrder("bbbbfcgrrrrrrkevvvgtt");
		System.out.println();
		stringCompressionwithoutOrder("bbbbfcgrrrrrrkevvvgtt");

	}

}
