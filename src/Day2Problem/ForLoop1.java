package Day2Problem;
import java.util.Scanner;
public class ForLoop1 {
	/**
	 * Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
	 */

	public static void main(String[] args) {
		int sum=0;
		/**
		 * taking user input
		 */
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		for (int i=0; i<=n; i++) {
			sum=sum+i;
		}
		System.out.println("Sum of n natural numbers = " +sum);
		
		

	}

}
