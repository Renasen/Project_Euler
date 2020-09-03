import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int num, pal = -1;
		
		for(int i = 100; i <= 999; i++) {
			for(int j = 100; j <= 999; j++) {
				num = i * j;
				if(isPalindrome(num) && num > pal) {
					pal = num;
				}
			}
		}
		
		System.out.println("Largest Palindrome: " + pal);
	}
	
	public static boolean isPalindrome(int n) {
		String s = Integer.toString(n);
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		
		return true;
	}

}
