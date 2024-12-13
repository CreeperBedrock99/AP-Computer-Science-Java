/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a phrase or sentence: ");
		String line = sc.nextLine();
		int spaces = 0;
		int length = line.length();
		String character = "";
		for (int i = 0; i < length; i++){
			character = line.substring(i, i + 1);
			if (character.equals(" ")){
				spaces++;
			}
		}
		int numWords = spaces + 1;
		String [] arr = new String[spaces + 1];
		int start = 0;
		for (int i = 0; i < length; i++){
			character = line.substring(i, i + 1);
			if (character.equals(" ")){
				arr[spaces] = line.substring(start, i);
				spaces--;
				start = i + 1;
			}else if (i + 1 == length){
				arr[0] = line.substring(start);
			}
		}
		String reverse = "";
		for (int i = 0; i < numWords; i++){
			reverse = reverse + " " + arr[i];
		}
		System.out.print(reverse);
	}
}
