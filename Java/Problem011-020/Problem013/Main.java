import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("numbers.txt");
		Scanner in = new Scanner(file);
		int[] list = new int[50];
		String number;
		
		while(in.hasNextLine()) {
			number = in.nextLine();
			
			for(int i = 0; i < 50; i++) {
				list[i] += Integer.parseInt(number.valueOf(number.charAt(i)));
			}
		}
		
		for(int i = 49; i >= 1; i--) {
			list[i-1] += list[i]/10;
			list[i] = list[i] % 10;
		}
		
		for(int i = 0; i < 8; i++) {
			System.out.print(list[i]);
		}
	}
}
