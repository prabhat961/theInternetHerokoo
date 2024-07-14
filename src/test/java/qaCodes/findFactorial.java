package qaCodes;

public class findFactorial {
	//iterative way:
	public static int printFactorial(int num) {
		int res = 1;
		for( int i = 2; i <= num; i++) {
			res = res * i;
		}
		return res;
	}
	
	//Recursive way:
	public static int printFact(int num) {
		if(num == 0)
			return 1;
		return num*(printFact(num - 1));
	}
	
	
	public static void main(String[] args) {
		System.out.println("Factorial of the number is:"+printFactorial(10));
		System.out.println("Factorial of the number is:"+printFact(10));

	}

}
