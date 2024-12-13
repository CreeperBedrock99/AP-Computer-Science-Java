/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a name: ");
		String name = sc.nextLine();
		System.out.print("Please enter how many times you want " + name + " to be printed: ");
		int printnum = sc.nextInt();
		while (printnum > 0){
			System.out.println(name);
			printnum = printnum - 1;
		}
	}
}
