package qaCodes;

public class AverageOfPrimeNumber {
	
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for(int i = 2; i<= Math.sqrt(num); i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static double averageOfPrimeNumberInRange(int start, int end) {
		int sum = 0;
	    int count = 0;

	    for (int num = start; num <= end; num++) {
	        if (isPrime(num)) {
	            sum += num;
	            count++;
	        }
	    }

	    if (count == 0) {
	        System.out.println("No prime numbers found in the specified range.");
	        return 0; // Return 0 if no prime numbers found
	    }

	    return (double) sum / count;
	}

	public static void main(String[] args) {
		int start = 5;
	    int end = 20;
	    double average = averageOfPrimeNumberInRange(start, end);
	    System.out.println("Average of prime numbers between " + start + " and " + end + ": " + average);

	}

}
