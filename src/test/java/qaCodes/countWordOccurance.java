package qaCodes;

import java.util.HashMap;
import java.util.Map;

public class countWordOccurance {
	
	public static void printWordCOunt(String str) {
		String[] arr = str.split(" ");
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		for(String c: arr) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			} 
		}
		for(Map.Entry<String, Integer>me: map.entrySet()) {
			System.out.println(me.getKey()+""+me.getValue());
		}
		
	}

	public static void main(String[] args) {
		printWordCOunt("I am Java developer I am proud of it");

	}

}
