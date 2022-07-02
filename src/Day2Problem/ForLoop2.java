package Day2Problem;

import java.util.Scanner;

public class ForLoop2 {
	/**
	 * Write a Program to reverse the integer number eg. Input n=231 reverse is 132
	 */

	public static void main(String[] args) {
		int rev= 0, rem=0;
	/**
	 * taking user input
	 */
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		
		
		for ( int n = sc.nextInt(); n>0; n=n/10) {
			 rem= n%10;
			rev= rev*10+ rem;
		}
			
		System.out.print(rev);
			
		
	}

}
