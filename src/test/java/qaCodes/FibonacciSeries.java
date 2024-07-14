package qaCodes;

public class FibonacciSeries {
	public static void printSeries(int N) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" "+num2);
		for(int i = 2; i < N; i++) {
			int num3 = num1 + num2;
			System.out.print(" "+num3);
			num1 = num2;
			num2 = num3;
		}
	}

	public static void main(String[] args) {
		printSeries(5);

	}

}
