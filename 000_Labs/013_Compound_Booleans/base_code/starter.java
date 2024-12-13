/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int maximum = 0;
		int minimum = 0;
		System.out.print("Please enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter a different number: ");
		int num2 = sc.nextInt();
		System.out.print("Please enter another different number: ");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3){
			maximum = num1;
		}else if (num2 > num1 && num2 > num3){
			maximum = num2;
		}else if (num3 > num1 && num3 > num2){
			maximum = num3;
		}
		if (num1 < num2 && num1 < num3){
			minimum = num1;
		}else if (num2 < num1 && num2 < num3){
			minimum = num2;
		}else if (num3 < num1 && num3 < num2){
			minimum = num3;
		}
		System.out.print("Your maximum number was " + maximum + " and your minimum number was " + minimum + ".");
	}
}
