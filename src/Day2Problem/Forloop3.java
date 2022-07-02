package Day2Problem;
import java.util.Scanner;
public class Forloop3 {
	/**
	 * 
	 * Write a Program to find Palindrome Number using for loop
	 */

	public static void main(String[] args) {
		int num=0, rem, sum=0,c=0;
		/**
		 * Taking user input
		 */
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		 num = sc.nextInt();
				 c=num;
		
		
		for (   ;  num>0 ;   ) {
			rem = num%10;
			sum = (sum*10) + rem;
			num = num/10;
		}
		 
		if ( c == sum ) {
			 System.out.println("Palindrome Number");
		}
		 else { 
			 System.out.println("Not a palindrome number");
		 }
			
		

	}

}
