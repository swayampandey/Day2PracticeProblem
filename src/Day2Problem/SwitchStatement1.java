package Day2Problem;
import java.util.Scanner;
public class SwitchStatement1 {
	/**
	 * Write a Program to Check Vowel or Consonant using switch statement
	 */

	public static void main(String[] args) {
		char ch; 
		System.out.println("Enter any character ");
		Scanner sc = new Scanner(System.in);
		   ch = sc.next().charAt(0);
		   
		 
		   switch (ch) {
		   case 'a' | 'A':
			   System.out.println(ch+ "is vowel");
			   break;
		  
		   case 'e' | 'E':
		   System.out.println(ch+ "is vowel");
		   break;
		
		   case 'i' | 'I':
		   System.out.println(ch+ "is vowel");
		   break;
		   
		   case 'o' | 'O':
		   System.out.println(ch+ "is vowel");
		   break;
		   
		   case 'u' | 'U':
		   System.out.println(ch+ "is vowel");
		   break;
		   
		   default:
			   System.out.println(ch+ " is consonant");
		   }
	}

}
