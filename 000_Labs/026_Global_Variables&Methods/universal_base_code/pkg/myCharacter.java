/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	int example = 0;
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int charisma;
	public myCharacter() {
		role = new String("No role.");
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	public myCharacter(String inRole){
		role = inRole;
		strength = 3;
		dexterity = 5;
		intelligence = 10;
		charisma = 2;
	}
	public void myToString(){
		System.out.println("Role: " + role);
		System.out.print("Stats: Strength: " + strength + ", Dexterity: " + dexterity + ", Intelligence: " + intelligence + ", Charisma: " + charisma);
	}
}

