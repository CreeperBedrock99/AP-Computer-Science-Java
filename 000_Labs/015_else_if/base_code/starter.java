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
		}else if (guess > random){
			System.out.print("You guess is " + (guess - random) + " higher than the correct number.");
		}else{
			System.out.print("You guess is " + (random - guess) + " lower than the correct number.");
		}
	}
}
