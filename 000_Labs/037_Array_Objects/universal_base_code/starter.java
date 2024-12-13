/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] arr1 = new Wizard[100];
		Warrior[] arr2 = new Warrior[100];
		for (int i = 0; i < 100; i++){
			arr1[i] = new Wizard("Wizard " + i);
			arr2[i] = new Warrior("Warrior " + i);
		}
		int wizards = 100;
		int warriors = 100;
		while (wizards > 0 && warriors > 0){
			arr1[wizards - 1].attack(arr2[warriors - 1]);
			if (arr2[warriors - 1].isDead()){
				System.out.println(arr2[warriors - 1].getName() + " has been defeated.");
				warriors--;
			}
			if(warriors == 0){
				System.out.println("The wizards have won with " + wizards + " wizards remaining!");
			}
			arr2[warriors - 1].attack(arr1[wizards - 1]);
			if (arr1[wizards - 1].isDead()){
				System.out.println(arr1[wizards - 1].getName() + " has been defeated.");
				wizards--;
			}
			if(wizards == 0){
				System.out.println("The warriors have won with " + warriors + " warriors remaining!");
			}
		}
	}
}
