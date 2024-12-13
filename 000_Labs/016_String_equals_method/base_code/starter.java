/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to be a Wizard, Warrior, or Rogue? ");
		String role = sc.nextLine();
		if (role.equals("wizard") || role.equals("Wizard")){
			System.out.print("You have chosen to play the role of a Wizard.");
		}else if (role.equals("warrior") || role.equals("Warrior")){
			System.out.print("You have chosen to play the role of a Warrior.");
		}else if (role.equals("rogue") || role.equals("Rogue")){
			System.out.print("You have chosen to play the role of a Rogue.");
		}else{
			System.out.print("Invalid role input.");
		}
	}
}
