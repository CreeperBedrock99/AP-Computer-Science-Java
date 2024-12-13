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
		System.out.print("Please enter a word: ");
		String word = sc.nextLine();
		int length = word.length();
		for (int i = 0; i < length; i++){
			System.out.println(word.substring(i,i+1));
		}
	}
}
