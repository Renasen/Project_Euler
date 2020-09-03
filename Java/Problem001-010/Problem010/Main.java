
public class Main {

	public static void main(String[] args) {
		long sum = 0;
		
		for(int i = 1; i < 2000000; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		
		System.out.println("Sum: " + sum);
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
