/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String parameter){
		System.out.println(parameter);
	}
	
	public static void toStringCombined(String line1, String line2){
		System.out.print(line1);
		System.out.print(line2);
	}
	
	public static void main(String args[]) {
		toString("I love to learn coding remotely.");
		toStringCombined("It's a fun class. ","You should try it out.");
	}
}
