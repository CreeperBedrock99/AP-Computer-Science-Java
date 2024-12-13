/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		int bet;
		int num1;
		int num2;
		int num3;
		System.out.println("Let's play a slot machine!");
		System.out.println("You will start with $100");
		System.out.println("If no number match, you win nothing");
		System.out.println("If two numbers match, your money doubles");
		System.out.println("If all three numbers match, your money triples");
		System.out.print("Ready to play? (y/n): ");
		String play = sc.nextLine();
		while (!play.equals("No") || !play.equals("no") || !play.equals("N") || !play.equals("n")){
			if (play.equals("Yes") || play.equals("yes") || play.equals("Y") || play.equals("y")){
				System.out.print("Please insert your bet: ");
				bet = sc.nextInt();
				sc.nextLine();
				if (bet > money){
					System.out.println("Sorry, you can't bet more than that amount :(");
				}else if (bet < 0){
					System.out.println("Really? Trying to take out money? nice try.");
				}else if (bet == 0){
					System.out.println("Insufficient funds :|");
				}else{
					money = money - bet;
					num1 = (int) (Math.random() * 10 + 1);
					num2 = (int) (Math.random() * 10 + 1);
					num3 = (int) (Math.random() * 10 + 1);
					System.out.println("______________");
					System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " |");
					System.out.println("______________");
					if (num1 == num2 || num1 == num3 || num2 == num3){
						bet = bet * 2;
						money = money + bet;
						System.out.println("You got doubles! You earned twice your original bet! :D");
					}else if (num1 == num2 && num1 == num3){
						bet = bet * 3;
						money = money + bet;
						System.out.println("You hit the jackpot! You've earned tripple your original bet! B)");
					}else{
						System.out.println("You lost your bet :(");
					}
					System.out.println("You now have $" + money);
					if (money == 0){
						System.out.println("You have no money.");
						break;
					}else{
						System.out.print("Would you like to play again? y/n: ");
						play = sc.nextLine();
					}
				}
			}else if (play.equals("No") || play.equals("no") || play.equals("N") || play.equals("n")){
				break;
			}else{
				System.out.print("That wasn't quite the answer I was looking for. :| Would you like to play? (y/n): ");
				play = sc.nextLine();
			}
		}
		System.out.println("Ok, bye now :)");
	}
}
