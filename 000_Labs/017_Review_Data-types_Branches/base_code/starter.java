/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.print("Please enter your title (start with 'the...'): ");
		String title = sc.nextLine();
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
		int points = 20;
		int strength = 0;
		int dexterity = 0;
		int intelligence = 0;
		int charisma = 0;
		System.out.println("You have " + points + " points to spend on traits with each of them having a maximum of 10 points. Which do you want to add one point to?");
		while (points > 0){
			System.out.println("Strength - Toughnes and ability to carry larger objects.");
			System.out.println("Dexterity - Agility and quick movement.");
			System.out.println("Intelligence - Better usage of magic");
			System.out.println("Charisma - Personability");
			String trait = sc.nextLine();
			if (trait.equals("strength") || trait.equals("Strength")){
				if (strength < 10){
					System.out.println("You have chosen to upgrade Strength.");
					strength = strength + 1;
					points = points - 1;
				}else{
					System.out.println("You have maxed out Strength.");
				}
			}else if (trait.equals("dexterity") || trait.equals("Dexterity")){
				if (dexterity < 10){
					System.out.println("You have chosen to upgrade Dexterity.");
					dexterity = dexterity + 1;
					points = points - 1;
				}else{
					System.out.println("You have maxed out Dexterity.");
				}
			}else if (trait.equals("intelligence") || trait.equals("Intelligence")){
				if (intelligence < 10){
					System.out.println("You have chosen to upgrade Intelligence.");
					intelligence = intelligence + 1;
					points = points - 1;
				}else{
					System.out.println("You have maxed out Intelligence.");
				}
			}else if (trait.equals("charisma") || trait.equals("Charisma")){
				if (charisma < 10){
					System.out.println("You have chosen to upgrade Charisma.");
					charisma = charisma + 1;
					points = points - 1;
				}else{
					System.out.println("You have maxed out Charisma.");
				}
			}else{
				System.out.println("Invalid trait input.");
			}
			if (points < 0){
				System.out.println("You have " + points + " points left. Which do you want to add one point to?");
			}
		}
		System.out.print("Your name is " + name + " " + title + " and you are a " + role + ". Your stats are: Strength: " + strength + ", Dexterity: " + dexterity + ", Intelligence: " + intelligence + ", Charisma: " + charisma + ".");
	}
}
