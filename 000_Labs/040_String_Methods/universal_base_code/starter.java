/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a full name (Includes a first and last name): ");
		String name = sc.nextLine();
		int length = name.length();
		String lastName = "";
		for(int i = 0; i < length; i++){
			String character = name.substring(i, i + 1);
			if (character.equals(" ")){
				lastName = name.substring(i + 1);
			}
		}
		System.out.print("The last name in your input is " + lastName + ".");
	}
}
