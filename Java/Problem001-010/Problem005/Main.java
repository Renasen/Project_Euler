
public class Main {

	public static void main(String[] args) {
		int num = 20;
		
		while(true) {
			if(isDivisible(num)) {
				break;
			}
			num++;
		}
		
		System.out.println("Smallest Multiple: " + num);
	}
	
	public static boolean isDivisible(int n) {
		for(int i = 1; i <= 20; i++) {
			if(n % i != 0) {
				return false;
			}
		}
		return true;
	}

}
