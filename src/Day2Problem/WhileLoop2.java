package Day2Problem;
import java.util.Scanner;

public class WhileLoop2 {
	/**
	 * 
	 * Write a Program to reverse the integer number eg. Input n=231 reverse is 132

	 */

	public static void main(String[] args) {
		int rev=0, rem=0;
		/**
		 * taking user input
		 */
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		sc.close();
		
		while(a>0) {
			 rem= a%10;
		     rev= rev*10+rem;
		     a=a/10;
		}
			System.out.print(rev);
			
			
		
		
		
		

	}

}
