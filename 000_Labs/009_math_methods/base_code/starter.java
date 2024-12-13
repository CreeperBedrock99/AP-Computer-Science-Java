/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int max1 = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		double sqrt = Math.sqrt(3 * 8 + 31 % 7);
		double pow = Math.pow(37 / 3, 35 % 21);
		double max2 = Math.max(Math.pow(2, 14 % 3),Math.sqrt(2 * 6));
		System.out.println(max1);
		System.out.println(sqrt);
		System.out.println(pow);
		System.out.println(max2);
		System.out.println("");
		System.out.print("Enter in a decimal or whole number: ");
		double x = sc.nextDouble();
		System.out.print("Enter in another decimal or whole number: ");
		double y = sc.nextDouble();
		double maxxy = Math.max(x,y);
		double sqrty = Math.sqrt(y);
		double powxy = Math.pow(x,y);
		System.out.println("The max of your two numbers is "+maxxy+".");
		System.out.println("The square root of your second number is "+sqrty+".");
		System.out.println("Your first number to the power of your second number is "+powxy+".");
		
		
	}
}
