
public class Main {

	public static void main(String[] args) {
		long triangle = 1, divisors = 1, count = 1;
		
		while(true) {
			for(int i = 1; i <= Math.sqrt(triangle); i++) {
				if(triangle % i == 0) {
					divisors += 2; // I'm still not sure why I'm adding 2 and not 1
				}
			}
			
			if(divisors > 500) {
				break;
			}
			else {
				divisors = 1;
				triangle += ++count;
			}
		}
		
		System.out.println("Triangle Number: " + triangle);
	}

}
