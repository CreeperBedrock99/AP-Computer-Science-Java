/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog dog1 = new Dog("Rover", 3);
		Dog dog2 = new Dog("Scout", "pitbull");
		if (dog1.isSleeping()){
			System.out.println(dog1.getName() + " is sleeping.");
		}else{
			dog1.bark();
			dog2.bark();
		}
	}
}
