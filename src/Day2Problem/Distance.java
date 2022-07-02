package Day2Problem;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		/*
		 * taking user input using scanner class
		 */
		System.out.println("Enter the value of x");
		System.out.println("Enter the value of y");
		 Scanner sc1 = new Scanner(System.in);
		 Scanner sc2 = new Scanner(System.in);
		 
		 int x = sc1.nextInt();
		 int y = sc2.nextInt();
		 
		 sc1.close(); sc2.close();    // closing scanner objects
		 
		 double distance = Math.pow(( x*x + y*y ), 0.5);
		 System.out.println("Euclidean distance = " +distance);
		

	}

}
