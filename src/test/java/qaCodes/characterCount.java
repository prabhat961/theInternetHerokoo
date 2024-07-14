package qaCodes;

import java.util.LinkedHashMap;
import java.util.Map;

public class characterCount {
	
	public static void charCount(String str){
	    LinkedHashMap<Character, Integer>mp = new LinkedHashMap<Character, Integer>();
	    for(int i = 0; i <= str.length() - 1; i++){
	        if(!mp.containsKey(str.charAt(i))){
	            mp.put(str.charAt(i),1);
	        }
	        else{
	            int val = mp.get(str.charAt(i));
	            mp.put(str.charAt(i),val+1);
	        }
	    }
	    for(Map.Entry<Character, Integer>me:mp.entrySet()){
	        System.out.print(me.getKey()+""+me.getValue());
	    }
	} 

	public static void main(String[] args) {
		charCount("aabaaccddb");

	}

}
