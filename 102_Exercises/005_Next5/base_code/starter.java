/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int input = sc.nextInt();
		double hundred = input / 100.0;
		double ten = input / 10.0;
		System.out.println("Here are the next five numbers after " + input + ":");
		System.out.println(input + ", " + (input + 1) + ", " + (input + 2) + ", " + (input + 3) + ", " + (input + 4) + ", " + (input + 5));
		System.out.println("Here are the next five multiples of " + input + ":");
		System.out.println(input + ", " + (input * 2) + ", " + (input * 3) + ", " + (input * 4) + ", " + (input * 5) + ", " + (input * 6));
		System.out.println("Here is " + input + " divided by 100:");
		System.out.println(hundred);
		System.out.println("Here is " + input + " divided by 10:");
		System.out.print(ten);
	}
}
