/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int x, int y){
		int power = x * x;
		y = y - 2;
		while(y > 0){
			power = power * x;
			y = y - 1;
		}
		return power;
	}
	
	public static void main(String args[]) {
		System.out.print(pow(4, 7));
	}
}
