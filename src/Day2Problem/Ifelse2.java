package Day2Problem;
import java.util.Scanner;

public class Ifelse2 {
	/**
	 * 
	 * Read a Number 1,10,100,1000 and display unit, ten hundred
	 */

	public static void main(String[] args) {
		/**
		 * Taking user input
		 */
		System.out.println("Enter a number");
		Scanner ref = new Scanner(System.in);
		int num = ref.nextInt();
		ref.close();
		
		if (num == 1) {
			System.out.println("unit");
		}
		else if (num == 10) {
			System.out.println("ten");
		}
		else if (num == 100) {
			System.out.println("hundred");
		}
		else if (num == 1000) {
			System.out.println("thousand");
		}
		else  {
			System.out.println("invalid input");
		}


	}

}
