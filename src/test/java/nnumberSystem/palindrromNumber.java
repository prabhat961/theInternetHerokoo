package nnumberSystem;

public class palindrromNumber {
	public static boolean checkPalindrome(int num) {
		int rev = 0;
		int temp = num;
		while(temp != 0) {
			rev = (rev * 10) + (temp % 10);
			temp = temp/10;
		}
		return (rev == num); 
	}
	

	public static void main(String[] args) {
		int n = 7007;
		if (checkPalindrome(n) == true) {
		System.out.println("Yes");
		}
		else {
		System.out.println("No");
		}

	}

}
