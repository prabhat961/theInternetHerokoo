package qaCodes;


public class primeNumber {
	public static boolean chkPrime(int num) {
		if (num <= 1 && num % 2 == 0) 
			return false;
		else if (num == 2) 
			return true;
		
		for( int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0 )
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		if (chkPrime(19))
			System.out.println("true");

		else
			System.out.println("false");
	}

}
