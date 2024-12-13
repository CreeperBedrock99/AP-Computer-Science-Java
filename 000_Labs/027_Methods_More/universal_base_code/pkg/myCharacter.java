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
	public myCharacter(String setRole){
		role = setRole;
	}
	public int setStrength(int myStrength){
		strength = myStrength;
		return strength;
	}
	public int setDexterity(int myDexterity){
		dexterity = myDexterity;
		return dexterity;
	}
	public int setIntelligence(int myIntelligence){
		intelligence = myIntelligence;
		return intelligence;
	}
	public int setCharisma(int myCharisma){
		charisma = myCharisma;
		return charisma;
	}
	public boolean setAll(String setRole, int myStrength, int myDexterity, int myIntelligence, int myCharisma){
		role = setRole;
		strength = myStrength;
		dexterity = myDexterity;
		intelligence = myIntelligence;
		charisma = myCharisma;
		return true;
	}
	public void myToString(){
		System.out.println("Role: " + role);
		System.out.print("Stats: Strength: " + strength + ", Dexterity: " + dexterity + ", Intelligence: " + intelligence + ", Charisma: " + charisma);
	}
}