package qaCodes;

import java.util.Stack;

public class stringReverse {
	///Method : 1
	public static String reverseString(String str) {
		String rev = " ";
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	
	//Method 2:
	public static void Stringrev(String str) {
		System.out.println("Correct  String:"+str);
		char[] arr = str.toCharArray();
		int lo = 0;
		int hi = arr.length - 1;
		while(lo <= hi) {
			char temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
		String rev = new String(arr);
		System.out.println("Reversed  String:"+rev);
	}
	
	//Method 3:
	public static String StringrevwithStack(String str) {
		char[] reverseString = new char[str.length()]; 
        // Declare a stack of type Character 
        Stack<Character> stack = new Stack<Character>(); 
  
        // Traverse the String and push the character one by 
        // one into the Stack 
        for (int i = 0; i < str.length(); i++) { 
            // push the character into the Stack 
            stack.push(str.charAt(i)); 
        } 
  
        // Now Pop the Characters from the stack until it 
        // becomes empty 
  
        int i = 0; 
        while (!stack.isEmpty()) { // popping element until 
                                   // stack become empty 
            // get the character from the top of the stack 
            reverseString[i++] = stack.pop(); 
        } 
        // return string object 
        return new String(reverseString); 
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("prabhat"));
		System.out.println(StringrevwithStack("prabhat"));
		Stringrev("prabhat");
	}

}
