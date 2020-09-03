
public class Main {

	public static void main(String[] args) {
		int squareOfSum = 0, sumOfSquare = 0;
		
		// Square of Sums
		for(int i = 1; i <= 100; i++) {
			squareOfSum += i;
		}
		squareOfSum = (int) Math.pow(squareOfSum, 2);
		
		// Sum of Squares
		for(int j = 1; j <= 100; j++) {
			sumOfSquare += Math.pow(j, 2);
		}
		
		System.out.println("Sum Square Difference: " + (squareOfSum - sumOfSquare));
	}

}
