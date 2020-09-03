
public class Main {

	public static void main(String[] args) {
		int primeCount = 0, i = 0;
		
		while(primeCount < 10001) {
			i++;
			if(isPrime(i)) {
				primeCount++;
			}
		}
		
		System.out.println("10,001st Prime Number: " + i);
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
