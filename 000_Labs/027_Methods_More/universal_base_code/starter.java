/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter myRole = new myCharacter("Wizard");
		myRole.setStrength(3);
		myRole.setDexterity(5);
		myRole.setIntelligence(10);
		myRole.setCharisma(2);
		myRole.myToString();
	}
}
