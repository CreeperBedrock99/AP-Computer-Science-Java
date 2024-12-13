/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int int1 = (int) (Math.random() * 10);
		int int2 = (int) (Math.random() * 100 + 1);
		double double1 = (Math.random() + 2.5);
		double double2 = (Math.random() * (589 - 14) + 14);
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(double1);
		System.out.println(double2);
	}
}
