/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int secretnum = (int) (Math.random() * 1000 + 1);
		System.out.print("Gues a number between 1 and 1000: ");
		int guess = sc.nextInt();
		sc.nextLine();
		while (guess != secretnum){
			if (guess < secretnum){
				System.out.print("Too low, guess again: ");
				guess = sc.nextInt();
				sc.nextLine();
			}else if (guess > secretnum){
				System.out.print("Too high, guess again: ");
				guess = sc.nextInt();
				sc.nextLine();
			}
		}
		System.out.print("You guessed the secret number!");
	}
}
