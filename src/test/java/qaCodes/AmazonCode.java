package qaCodes;

class amz{
	static void print() {
		System.out.println("this is static method");
	}
}
public class AmazonCode {
	public static String reverseWOrd(String str) {
		String[] arr = str.split(" ");
		String revSent = " ";
		for(String word: arr){
			String revWOrd =" ";
			for(int i = word.length()-1; i >= 0;i--) {
				revWOrd = revWOrd + word.charAt(i);
			}
			revSent = revSent + revWOrd + " ";
		}
		return revSent;
	}

	public static void main(String[] args) {
		System.out.println(reverseWOrd(" Welcome to Amazon"));
		
	}

}
