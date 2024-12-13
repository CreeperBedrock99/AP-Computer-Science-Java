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
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		System.out.print("Say something sassy like, \"Oh my god...\": ");
		String sassy = sc.nextLine();
		System.out.print("\tSo they were like, \"" + sassy + "\"\nAnd I was like \"Oh my god, I don't care! DX\"");
	}
}
