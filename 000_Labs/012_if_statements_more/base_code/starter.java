/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter another number: ");
		int num2 = sc.nextInt();
		if (num1 != num2){
			System.out.print("Your two numbers are not equal.");
		}else{
			System.out.print("Your two numbers are equal.");
		}
	}
}
