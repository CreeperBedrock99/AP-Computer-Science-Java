/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Wizard");
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
}

class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
		myCharacter.strength = 3;
		myCharacter.dexterity = 5;
		myCharacter.intelligence = 10;
		myCharacter.charisma = 2;
		System.out.println("Role: " + myCharacter.role);
		System.out.print("Stats: Strength: " + myCharacter.strength + ", Dexterity: " + myCharacter.dexterity + ", Intelligence: " + myCharacter.intelligence + ", Charisma: " + myCharacter.charisma);
	}
}
