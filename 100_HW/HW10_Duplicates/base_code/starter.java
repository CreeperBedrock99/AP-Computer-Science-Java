/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		for (int i = 0; i < 20; i++){
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		int duplicates = 0;
		int target = (int)(Math.random() * 10 + 1);
		System.out.println("Your target number is " + target + ".");
		for (int i = 0; i < 20; i++){
			if (arr[i] == target){
				System.out.println("Your index number " + i + " is equal to the target number.");
				duplicates++;
			}
		}
		System.out.println("There are " + duplicates + " duplicates.");
		int consecutives = 0;
		for (int i = 0; i < 19; i++){
			if (arr[i] + 1 == arr[i + 1]){
				System.out.println("Your index number " + i + " which has a value of " + arr[i] + " is consecutive with index number " + (i+1) + ".");
				consecutives++;
			}
		}
		System.out.println("There are " + consecutives + " consecutive numbers.");
	}
}
