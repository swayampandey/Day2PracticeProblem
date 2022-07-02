package Day2Problem;
import java.util.Scanner;
public class WhileLoop1 {
/**
 * 
 * Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
 */
	public static void main(String[] args) {
		/**
		 * Taking user input
		 */
		int sum=0;
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int i =0;
		while (i<=N) {
			 sum= sum+i;
			i++;
		}
		System.out.println("Sum of given number = " +sum);
		}

	}


