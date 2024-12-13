/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[(int)(Math.random() * 150 + 51)];
		System.out.println("The length of your array is " + arr.length + ".");
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		int min = Integer.MAX_VALUE;
		min = 100;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("The minimum value in your array is " + min + ".");
		int max = Integer.MAX_VALUE;
		max = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("The maximum value in your array is " + max + ".");
		int average = 0;
		for (int i = 0; i < arr.length; i++){
			average = average + arr[i];
		}
		average = average / 100;
		System.out.println("The average of your array is " + average + ".");
	}
}
