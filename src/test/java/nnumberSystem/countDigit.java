package nnumberSystem;

public class countDigit {
	public static int countDigitInNumber(int num) {
		if(num/10 == 0)
			return 1;
		return 1 + countDigitInNumber(num/10);
	}

	public static void main(String[] args) {
		System.out.println("no.of digits in number is:"+countDigitInNumber(149875));
	}

}
