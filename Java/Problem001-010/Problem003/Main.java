
public class Main {

	public static void main(String[] args) {
		final long NUM = 600851475143L;
		long largestPrimeFactor = -1;
		
		for(long i = 1; i < Math.sqrt(NUM); i++) {
			if(NUM % i == 0) {
				if(isPrime(i)) {
					largestPrimeFactor = i;
				}
			}
		}
		
		System.out.println("Largest Prime Factor: " + largestPrimeFactor);
	}
	
	public static boolean isPrime(long n) {
		if(n == 2 || n == 3 || n == 5 || n == 7) {
			return true;
		}
		else if (n % 2 == 0 || n == 1) {
			return false;
		}
		else {
			for(int i = 3; i <= Math.sqrt(n); i += 2) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
