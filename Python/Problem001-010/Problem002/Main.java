
public class Main {
	public static void main(String[] args) {
		int low = 1, high = 2, next = 3, temp, sum = 2;
		
		while(next < 4000000) {
			temp = next;
			low = high;
			high = next;
			next = low + high;
			
			if(next % 2 == 0) {
				sum += next;
			}
		}
		
		System.out.println(sum);
	}
}
