/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter another integer that is bigger than " + num1 + ": ");
		int num2 = sc.nextInt();
		int range1 = (int)(Math.random() * (num2 - num1) + num1);
		int range2 = (int)(Math.random() * (num2 - num1) + num1);
		int range3 = (int)(Math.random() * (num2 - num1) + num1);
		int range4 = (int)(Math.random() * (num2 - num1) + num1);
		int range5 = (int)(Math.random() * (num2 - num1) + num1);
		System.out.print("5 random numbers within the range of your two numbers are " + range1 + ", " + range2 + ", " + range3 + ", " + range4 + ", " + range5 + ".");
	}
}
