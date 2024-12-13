/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter myrole = new myCharacter("Wizard");
		System.out.println("Role: " + myrole.role);
		myrole.strength = 3;
		myrole.dexterity = 5;
		myrole.intelligence = 10;
		myrole.charisma = 2;
		System.out.print("Stats: Strength: " + myrole.strength + ", Dexterity: " + myrole.dexterity + ", Intelligence: " + myrole.intelligence + ", Charisma: " + myrole.charisma);
	}
}
