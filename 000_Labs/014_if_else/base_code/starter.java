/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random = (int) (Math.random() * 1000 + 1);
		System.out.print("Please enter a number between 1 and 1000: ");
		int guess = sc.nextInt();
		if (guess == random){
			System.out.print("You guessed correctly! :D");
		}else{
			System.out.print("You guessed incorrectly. :(");
		}
	}
}